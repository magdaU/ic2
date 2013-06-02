package com.example.jeedemo.web;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Car;
import com.example.jeedemo.service.CarManager;

import java.io.Serializable;

@SessionScoped
@Named("carBean")
public class CarBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Car auto= new Car();
	private ListDataModel<Car> autka = new ListDataModel<Car>();
	
	@Inject
	private CarManager cm;

	public Car getAuto() {
		return auto;
	}

	public void setAuto(Car auto) {
		this.auto = auto;
	}

	public ListDataModel<Car> getAutka() {
		autka.setWrappedData(cm.getAllCars());
		return autka;
	}	
}
