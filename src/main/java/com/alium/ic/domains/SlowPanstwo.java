package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the slow_kraj database table.
 * 
 */
@Entity
@Table(name="slow_kraj")
@NamedQuery(name="panstwa.wszystkie", query="Select p from SlowPanstwo p")
public class SlowPanstwo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String kraj;

	//bi-directional many-to-one association to Agencja
	@OneToMany(mappedBy="slowKraj")
	private Set<Agencja> agencjas;

	//bi-directional many-to-one association to ObiektBudowa
	@OneToMany(mappedBy="slowKraj")
	private Set<ObiektBudowa> obiektBudowas;

	//bi-directional many-to-one association to ObiektNieruchomosc
	@OneToMany(mappedBy="slowKraj")
	private Set<ObiektNieruchomosc> obiektNieruchomoscs;

	//bi-directional many-to-one association to ObiektOsobaFiz
	@OneToMany(mappedBy="slowKraj")
	private Set<ObiektOsobaFiz> obiektOsobaFizs;

	//bi-directional many-to-one association to ObiektOsobaNiefiz
	@OneToMany(mappedBy="slowKraj")
	private Set<ObiektOsobaNiefiz> obiektOsobaNiefizs;

	public SlowPanstwo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKraj() {
		return this.kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public Set<Agencja> getAgencjas() {
		return this.agencjas;
	}

	public void setAgencjas(Set<Agencja> agencjas) {
		this.agencjas = agencjas;
	}

	public Agencja addAgencja(Agencja agencja) {
		getAgencjas().add(agencja);
		agencja.setSlowKraj(this);

		return agencja;
	}

	public Agencja removeAgencja(Agencja agencja) {
		getAgencjas().remove(agencja);
		agencja.setSlowKraj(null);

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
		obiektBudowa.setSlowKraj(this);

		return obiektBudowa;
	}

	public ObiektBudowa removeObiektBudowa(ObiektBudowa obiektBudowa) {
		getObiektBudowas().remove(obiektBudowa);
		obiektBudowa.setSlowKraj(null);

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
		obiektNieruchomosc.setSlowKraj(this);

		return obiektNieruchomosc;
	}

	public ObiektNieruchomosc removeObiektNieruchomosc(ObiektNieruchomosc obiektNieruchomosc) {
		getObiektNieruchomoscs().remove(obiektNieruchomosc);
		obiektNieruchomosc.setSlowKraj(null);

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
		obiektOsobaFiz.setSlowKraj(this);

		return obiektOsobaFiz;
	}

	public ObiektOsobaFiz removeObiektOsobaFiz(ObiektOsobaFiz obiektOsobaFiz) {
		getObiektOsobaFizs().remove(obiektOsobaFiz);
		obiektOsobaFiz.setSlowKraj(null);

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
		obiektOsobaNiefiz.setSlowKraj(this);

		return obiektOsobaNiefiz;
	}

	public ObiektOsobaNiefiz removeObiektOsobaNiefiz(ObiektOsobaNiefiz obiektOsobaNiefiz) {
		getObiektOsobaNiefizs().remove(obiektOsobaNiefiz);
		obiektOsobaNiefiz.setSlowKraj(null);

		return obiektOsobaNiefiz;
	}

}