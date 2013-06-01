package com.example.jeedemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="slow_panstwo")
@NamedQuery(name="panstwa.wszystkie", query="Select p from Panstwo p")
public class Panstwo {
	@Id
	private long id;
	private String nazwa;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	

}
