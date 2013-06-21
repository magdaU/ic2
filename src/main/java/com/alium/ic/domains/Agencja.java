package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the agencja database table.
 * 
 */
@Entity
@NamedQuery(name="wszystkie.agencje", query="SELECT a FROM Agencja a")
public class Agencja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String email;

	@Column(name="kod_poczt")
	private String kodPoczt;

	private String nazwa;

	private String nip;

	@Column(name="nr_konta_b")
	private String nrKontaB;

	@Column(name="nr_lokal")
	private String nrLokal;

	@Column(name="nr_obow_oc")
	private String nrObowOc;

	private String op = "Magda";

	private String przedrostek;

	private String regon;

	private String ulica;

	private Timestamp wd;

	@Column(name="wpis_do_rej")
	private String wpisDoRej;

	//bi-directional many-to-one association to SlowKraj
	@ManyToOne
	@JoinColumn(name="id_kraj")
	private SlowPanstwo slowKraj;

	//bi-directional many-to-one association to SlowMiasto
	@ManyToOne
	@JoinColumn(name="id_miasto")
	private SlowMiasto slowMiasto;

	//bi-directional many-to-one association to SlowWojewodztwo
	@ManyToOne
	@JoinColumn(name="id_woj")
	private SlowWojewodztwo slowWojewodztwo;

	//bi-directional many-to-one association to AgencjaUmowa
	@OneToMany(mappedBy="agencja")
	private Set<AgencjaUmowa> agencjaUmowas;

	//bi-directional many-to-one association to AgencjaWyplata
	@OneToMany(mappedBy="agencja")
	private Set<AgencjaWyplata> agencjaWyplatas;

	//bi-directional many-to-one association to Polisa
	@OneToMany(mappedBy="agencja")
	private Set<Polisa> polisas;

	public Agencja() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKodPoczt() {
		return this.kodPoczt;
	}

	public void setKodPoczt(String kodPoczt) {
		this.kodPoczt = kodPoczt;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNip() {
		return this.nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNrKontaB() {
		return this.nrKontaB;
	}

	public void setNrKontaB(String nrKontaB) {
		this.nrKontaB = nrKontaB;
	}

	public String getNrLokal() {
		return this.nrLokal;
	}

	public void setNrLokal(String nrLokal) {
		this.nrLokal = nrLokal;
	}

	public String getNrObowOc() {
		return this.nrObowOc;
	}

	public void setNrObowOc(String nrObowOc) {
		this.nrObowOc = nrObowOc;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getPrzedrostek() {
		return this.przedrostek;
	}

	public void setPrzedrostek(String przedrostek) {
		this.przedrostek = przedrostek;
	}

	public String getRegon() {
		return this.regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public String getUlica() {
		return this.ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

	public String getWpisDoRej() {
		return this.wpisDoRej;
	}

	public void setWpisDoRej(String wpisDoRej) {
		this.wpisDoRej = wpisDoRej;
	}

	public SlowPanstwo getSlowKraj() {
		return this.slowKraj;
	}

	public void setSlowKraj(SlowPanstwo slowKraj) {
		this.slowKraj = slowKraj;
	}

	public SlowMiasto getSlowMiasto() {
		return this.slowMiasto;
	}

	public void setSlowMiasto(SlowMiasto slowMiasto) {
		this.slowMiasto = slowMiasto;
	}

	public SlowWojewodztwo getSlowWojewodztwo() {
		return this.slowWojewodztwo;
	}

	public void setSlowWojewodztwo(SlowWojewodztwo slowWojewodztwo) {
		this.slowWojewodztwo = slowWojewodztwo;
	}

	public Set<AgencjaUmowa> getAgencjaUmowas() {
		return this.agencjaUmowas;
	}

	public void setAgencjaUmowas(Set<AgencjaUmowa> agencjaUmowas) {
		this.agencjaUmowas = agencjaUmowas;
	}

	public AgencjaUmowa addAgencjaUmowa(AgencjaUmowa agencjaUmowa) {
		getAgencjaUmowas().add(agencjaUmowa);
		agencjaUmowa.setAgencja(this);

		return agencjaUmowa;
	}

	public AgencjaUmowa removeAgencjaUmowa(AgencjaUmowa agencjaUmowa) {
		getAgencjaUmowas().remove(agencjaUmowa);
		agencjaUmowa.setAgencja(null);

		return agencjaUmowa;
	}

	public Set<AgencjaWyplata> getAgencjaWyplatas() {
		return this.agencjaWyplatas;
	}

	public void setAgencjaWyplatas(Set<AgencjaWyplata> agencjaWyplatas) {
		this.agencjaWyplatas = agencjaWyplatas;
	}

	public AgencjaWyplata addAgencjaWyplata(AgencjaWyplata agencjaWyplata) {
		getAgencjaWyplatas().add(agencjaWyplata);
		agencjaWyplata.setAgencja(this);

		return agencjaWyplata;
	}

	public AgencjaWyplata removeAgencjaWyplata(AgencjaWyplata agencjaWyplata) {
		getAgencjaWyplatas().remove(agencjaWyplata);
		agencjaWyplata.setAgencja(null);

		return agencjaWyplata;
	}

	public Set<Polisa> getPolisas() {
		return this.polisas;
	}

	public void setPolisas(Set<Polisa> polisas) {
		this.polisas = polisas;
	}

	public Polisa addPolisa(Polisa polisa) {
		getPolisas().add(polisa);
		polisa.setAgencja(this);

		return polisa;
	}

	public Polisa removePolisa(Polisa polisa) {
		getPolisas().remove(polisa);
		polisa.setAgencja(null);

		return polisa;
	}

}