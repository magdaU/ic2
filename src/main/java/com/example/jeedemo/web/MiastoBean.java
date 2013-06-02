package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Miasto;
import com.example.jeedemo.service.MiastoManager;

@SessionScoped
@Named("miastoBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class MiastoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Miasto miasto= new Miasto();
	//model danych
	private ListDataModel<Miasto> miasta= new ListDataModel<Miasto>();
	
	@Inject
	MiastoManager mm;
	
	public Miasto getMiasto() {
		return miasto;
	}
	public void setMiasto(Miasto miasto) {
		this.miasto = miasto;
	}
	public ListDataModel<Miasto> getMiasta() {
		miasta.setWrappedData(mm.getMiasto());
		return miasta;
	}	
}
