package com.alium.ic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "car.unsold", query = "Select c from Car c where c.sold = false"),
	@NamedQuery(name= "car.sold", query = "Select c from Car c where c.sold=true"),
	@NamedQuery(name = "car.all", query = "Select c from Car c")})

public class Car {
	
	private Long id;
	private String make;
	private String model;
	private Boolean sold = false;
	
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Boolean getSold() {
		return sold;
	}
	public void setSold(Boolean sold) {
		this.sold = sold;
	}
}
