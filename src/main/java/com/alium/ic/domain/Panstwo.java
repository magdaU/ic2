package com.alium.ic.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="slow_panstwo")
@NamedQuery(name="panstwa.wszystkie", query="Select p from Panstwo p")
public class Panstwo {
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
