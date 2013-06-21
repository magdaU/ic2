package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the slow_wojewodztwo database table.
 * 
 */
@Entity 
@Table(name="slow_wojewodztwo")
@NamedQuery (name="wszystkie.wojewodztwa", query="Select w from SlowWojewodztwo w")
public class SlowWojewodztwo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String wojewodztwo;

	//bi-directional many-to-one association to Agencja
	@OneToMany(mappedBy="slowWojewodztwo")
	private Set<Agencja> agencjas;

	//bi-directional many-to-one association to ObiektBudowa
	@OneToMany(mappedBy="slowWojewodztwo")
	private Set<ObiektBudowa> obiektBudowas;

	//bi-directional many-to-one association to ObiektNieruchomosc
	@OneToMany(mappedBy="slowWojewodztwo")
	private Set<ObiektNieruchomosc> obiektNieruchomoscs;

	//bi-directional many-to-one association to ObiektOsobaFiz
	@OneToMany(mappedBy="slowWojewodztwo")
	private Set<ObiektOsobaFiz> obiektOsobaFizs;

	//bi-directional many-to-one association to ObiektOsobaNiefiz
	@OneToMany(mappedBy="slowWojewodztwo")
	private Set<ObiektOsobaNiefiz> obiektOsobaNiefizs;

	public SlowWojewodztwo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWojewodztwo() {
		return this.wojewodztwo;
	}

	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public Set<Agencja> getAgencjas() {
		return this.agencjas;
	}

	public void setAgencjas(Set<Agencja> agencjas) {
		this.agencjas = agencjas;
	}

	public Agencja addAgencja(Agencja agencja) {
		getAgencjas().add(agencja);
		agencja.setSlowWojewodztwo(this);

		return agencja;
	}

	public Agencja removeAgencja(Agencja agencja) {
		getAgencjas().remove(agencja);
		agencja.setSlowWojewodztwo(null);

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
		obiektBudowa.setSlowWojewodztwo(this);

		return obiektBudowa;
	}

	public ObiektBudowa removeObiektBudowa(ObiektBudowa obiektBudowa) {
		getObiektBudowas().remove(obiektBudowa);
		obiektBudowa.setSlowWojewodztwo(null);

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
		obiektNieruchomosc.setSlowWojewodztwo(this);

		return obiektNieruchomosc;
	}

	public ObiektNieruchomosc removeObiektNieruchomosc(ObiektNieruchomosc obiektNieruchomosc) {
		getObiektNieruchomoscs().remove(obiektNieruchomosc);
		obiektNieruchomosc.setSlowWojewodztwo(null);

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
		obiektOsobaFiz.setSlowWojewodztwo(this);

		return obiektOsobaFiz;
	}

	public ObiektOsobaFiz removeObiektOsobaFiz(ObiektOsobaFiz obiektOsobaFiz) {
		getObiektOsobaFizs().remove(obiektOsobaFiz);
		obiektOsobaFiz.setSlowWojewodztwo(null);

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
		obiektOsobaNiefiz.setSlowWojewodztwo(this);

		return obiektOsobaNiefiz;
	}

	public ObiektOsobaNiefiz removeObiektOsobaNiefiz(ObiektOsobaNiefiz obiektOsobaNiefiz) {
		getObiektOsobaNiefizs().remove(obiektOsobaNiefiz);
		obiektOsobaNiefiz.setSlowWojewodztwo(null);

		return obiektOsobaNiefiz;
	}

}