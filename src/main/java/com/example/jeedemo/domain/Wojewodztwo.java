package com.example.jeedemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table (name="slow_wojewodztwo")
@NamedQuery (name="wszystkie.wojewodztwa", query="Select w from Wojewodztwo w")
public class Wojewodztwo {

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
