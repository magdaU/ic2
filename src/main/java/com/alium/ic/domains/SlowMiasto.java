package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_miasto database table.
 * 
 */
@Entity 
@Table(name="slow_miasto")
@NamedQuery(name="wszystkie.miasta", query = "SELECT m FROM SlowMiasto m")
public class SlowMiasto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String miasto;

	//bi-directional many-to-one association to Agencja
	@OneToMany(mappedBy="slowMiasto")
	private Set<Agencja> agencjas;

	//bi-directional many-to-one association to ObiektBudowa
	@OneToMany(mappedBy="slowMiasto")
	private Set<ObiektBudowa> obiektBudowas;

	//bi-directional many-to-one association to ObiektNieruchomosc
	@OneToMany(mappedBy="slowMiasto")
	private Set<ObiektNieruchomosc> obiektNieruchomoscs;

	//bi-directional many-to-one association to ObiektOsobaFiz
	@OneToMany(mappedBy="slowMiasto")
	private Set<ObiektOsobaFiz> obiektOsobaFizs;

	//bi-directional many-to-one association to ObiektOsobaNiefiz
	@OneToMany(mappedBy="slowMiasto")
	private Set<ObiektOsobaNiefiz> obiektOsobaNiefizs;

	public SlowMiasto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMiasto() {
		return this.miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public Set<Agencja> getAgencjas() {
		return this.agencjas;
	}

	public void setAgencjas(Set<Agencja> agencjas) {
		this.agencjas = agencjas;
	}

	public Agencja addAgencja(Agencja agencja) {
		getAgencjas().add(agencja);
		agencja.setSlowMiasto(this);

		return agencja;
	}

	public Agencja removeAgencja(Agencja agencja) {
		getAgencjas().remove(agencja);
		agencja.setSlowMiasto(null);

		return agencja;
	}

	public Set<ObiektBudowa> getObiektBudowas() {
		return this.obiektBudowas;
	}

	public void setObiektBudowas(Set<ObiektBudowa> obiektBudowas) {
		this.obiektBudowas = obiektBudowas;
	}

	public ObiektBudowa addObiektBudowa(ObiektBudowa obiektBudowa) {
		getObiektBudowas().add(obiektBudowa);
		obiektBudowa.setSlowMiasto(this);

		return obiektBudowa;
	}

	public ObiektBudowa removeObiektBudowa(ObiektBudowa obiektBudowa) {
		getObiektBudowas().remove(obiektBudowa);
		obiektBudowa.setSlowMiasto(null);

		return obiektBudowa;
	}

	public Set<ObiektNieruchomosc> getObiektNieruchomoscs() {
		return this.obiektNieruchomoscs;
	}

	public void setObiektNieruchomoscs(Set<ObiektNieruchomosc> obiektNieruchomoscs) {
		this.obiektNieruchomoscs = obiektNieruchomoscs;
	}

	public ObiektNieruchomosc addObiektNieruchomosc(ObiektNieruchomosc obiektNieruchomosc) {
		getObiektNieruchomoscs().add(obiektNieruchomosc);
		obiektNieruchomosc.setSlowMiasto(this);

		return obiektNieruchomosc;
	}

	public ObiektNieruchomosc removeObiektNieruchomosc(ObiektNieruchomosc obiektNieruchomosc) {
		getObiektNieruchomoscs().remove(obiektNieruchomosc);
		obiektNieruchomosc.setSlowMiasto(null);

		return obiektNieruchomosc;
	}

	public Set<ObiektOsobaFiz> getObiektOsobaFizs() {
		return this.obiektOsobaFizs;
	}

	public void setObiektOsobaFizs(Set<ObiektOsobaFiz> obiektOsobaFizs) {
		this.obiektOsobaFizs = obiektOsobaFizs;
	}

	public ObiektOsobaFiz addObiektOsobaFiz(ObiektOsobaFiz obiektOsobaFiz) {
		getObiektOsobaFizs().add(obiektOsobaFiz);
		obiektOsobaFiz.setSlowMiasto(this);

		return obiektOsobaFiz;
	}

	public ObiektOsobaFiz removeObiektOsobaFiz(ObiektOsobaFiz obiektOsobaFiz) {
		getObiektOsobaFizs().remove(obiektOsobaFiz);
		obiektOsobaFiz.setSlowMiasto(null);

		return obiektOsobaFiz;
	}

	public Set<ObiektOsobaNiefiz> getObiektOsobaNiefizs() {
		return this.obiektOsobaNiefizs;
	}

	public void setObiektOsobaNiefizs(Set<ObiektOsobaNiefiz> obiektOsobaNiefizs) {
		this.obiektOsobaNiefizs = obiektOsobaNiefizs;
	}

	public ObiektOsobaNiefiz addObiektOsobaNiefiz(ObiektOsobaNiefiz obiektOsobaNiefiz) {
		getObiektOsobaNiefizs().add(obiektOsobaNiefiz);
		obiektOsobaNiefiz.setSlowMiasto(this);

		return obiektOsobaNiefiz;
	}

	public ObiektOsobaNiefiz removeObiektOsobaNiefiz(ObiektOsobaNiefiz obiektOsobaNiefiz) {
		getObiektOsobaNiefizs().remove(obiektOsobaNiefiz);
		obiektOsobaNiefiz.setSlowMiasto(null);

		return obiektOsobaNiefiz;
	}

}