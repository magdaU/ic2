package com.example.jeedemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity // oznaczenie klasy jako encji bean
@Table (name="slow_miasto") // pobierz z bazy danych tabelkę slow_miasto
@NamedQuery (name="wszystkie.miasta", query = "Select m from Miasto m") // Miasto - nazwa tej klasy
public class Miasto {
	
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
