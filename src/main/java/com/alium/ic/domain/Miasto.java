package com.alium.ic.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity // oznaczenie klasy jako encji bean
@Table (name="slow_miasto") // pobierz z bazy danych tabelkę slow_miasto
@NamedQuery (name="wszystkie.miasta", query = "Select m from Miasto m") // Miasto - nazwa tej klasy
public class Miasto {
	
	@Id
	private Long id;
	private String nazwa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
