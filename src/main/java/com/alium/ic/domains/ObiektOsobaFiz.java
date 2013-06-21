package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the obiekt_osoba_fiz database table.
 * 
 */
@Entity 
@Table(name="obiekt_osoba_fiz")
public class ObiektOsobaFiz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String imie;

	@Column(name="kod_poczt")
	private String kodPoczt;

	private String nazwisko;

	private String nip;

	@Column(name="nr_dowod_os")
	private String nrDowodOs;

	@Column(name="nr_konto_b")
	private String nrKontoB;

	@Column(name="nr_lokal")
	private String nrLokal;

	@Column(name="nr_telefonu")
	private String nrTelefonu;

	private String op;

	private String pesel;

	private String przedrostek;

	@Column(name="przetw_market")
	private byte przetwMarket;

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

	public ObiektOsobaFiz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getKodPoczt() {
		return this.kodPoczt;
	}

	public void setKodPoczt(String kodPoczt) {
		this.kodPoczt = kodPoczt;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNip() {
		return this.nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNrDowodOs() {
		return this.nrDowodOs;
	}

	public void setNrDowodOs(String nrDowodOs) {
		this.nrDowodOs = nrDowodOs;
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

	public String getNrTelefonu() {
		return this.nrTelefonu;
	}

	public void setNrTelefonu(String nrTelefonu) {
		this.nrTelefonu = nrTelefonu;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
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