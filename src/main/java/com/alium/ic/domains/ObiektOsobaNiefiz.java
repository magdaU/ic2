package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the obiekt_osoba_niefiz database table.
 * 
 */
@Entity 
@Table(name="obiekt_osoba_niefiz")
public class ObiektOsobaNiefiz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="kod_poczt")
	private String kodPoczt;

	private String nazwa;

	private String nip;

	@Column(name="nr_konto_b")
	private String nrKontoB;

	@Column(name="nr_lokal")
	private String nrLokal;

	@Column(name="nr_telefon")
	private String nrTelefon;

	private String op;

	private String przedrostek;

	@Column(name="przetw_market")
	private byte przetwMarket;

	private String regon;

	private String ulica;

	private Timestamp wd;

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

	public ObiektOsobaNiefiz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNrKontoB() {
		return this.nrKontoB;
	}

	public void setNrKontoB(String nrKontoB) {
		this.nrKontoB = nrKontoB;
	}

	public String getNrLokal() {
		return this.nrLokal;
	}

	public void setNrLokal(String nrLokal) {
		this.nrLokal = nrLokal;
	}

	public String getNrTelefon() {
		return this.nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
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

	public byte getPrzetwMarket() {
		return this.przetwMarket;
	}

	public void setPrzetwMarket(byte przetwMarket) {
		this.przetwMarket = przetwMarket;
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

}