package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_obszar database table.
 * 
 */
@Entity 
@Table(name="slow_obszar")
public class SlowObszar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String kod;

	private String opis;

	//bi-directional many-to-one association to AgencjaObszUm
	@OneToMany(mappedBy="slowObszar")
	private Set<AgencjaObszUm> agencjaObszUms;

	public SlowObszar() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKod() {
		return this.kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<AgencjaObszUm> getAgencjaObszUms() {
		return this.agencjaObszUms;
	}

	public void setAgencjaObszUms(Set<AgencjaObszUm> agencjaObszUms) {
		this.agencjaObszUms = agencjaObszUms;
	}

	public AgencjaObszUm addAgencjaObszUm(AgencjaObszUm agencjaObszUm) {
		getAgencjaObszUms().add(agencjaObszUm);
		agencjaObszUm.setSlowObszar(this);

		return agencjaObszUm;
	}

	public AgencjaObszUm removeAgencjaObszUm(AgencjaObszUm agencjaObszUm) {
		getAgencjaObszUms().remove(agencjaObszUm);
		agencjaObszUm.setSlowObszar(null);

		return agencjaObszUm;
	}

}