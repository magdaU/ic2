package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the polisa_arch database table.
 * 
 */
@Entity 
@Table(name="polisa_arch")
public class PolisaArch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_do")
	private Date dataDo;

	@Temporal(TemporalType.DATE)
	@Column(name="data_od")
	private Date dataOd;

	@Temporal(TemporalType.DATE)
	@Column(name="data_zawarcia")
	private Date dataZawarcia;

	@Column(name="id_agencja")
	private int idAgencja;

	@Column(name="id_osoba")
	private int idOsoba;

	@Column(name="id_polisa")
	private int idPolisa;

	@Column(name="id_rodz_plat")
	private int idRodzPlat;

	@Column(name="ilosc_rat")
	private byte iloscRat;

	private String kto;

	@Column(name="nr_polisa")
	private String nrPolisa;

	private String op;

	@Column(name="suma_skladka")
	private BigDecimal sumaSkladka;

	private Timestamp wd;

	public PolisaArch() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataDo() {
		return this.dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public Date getDataOd() {
		return this.dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataZawarcia() {
		return this.dataZawarcia;
	}

	public void setDataZawarcia(Date dataZawarcia) {
		this.dataZawarcia = dataZawarcia;
	}

	public int getIdAgencja() {
		return this.idAgencja;
	}

	public void setIdAgencja(int idAgencja) {
		this.idAgencja = idAgencja;
	}

	public int getIdOsoba() {
		return this.idOsoba;
	}

	public void setIdOsoba(int idOsoba) {
		this.idOsoba = idOsoba;
	}

	public int getIdPolisa() {
		return this.idPolisa;
	}

	public void setIdPolisa(int idPolisa) {
		this.idPolisa = idPolisa;
	}

	public int getIdRodzPlat() {
		return this.idRodzPlat;
	}

	public void setIdRodzPlat(int idRodzPlat) {
		this.idRodzPlat = idRodzPlat;
	}

	public byte getIloscRat() {
		return this.iloscRat;
	}

	public void setIloscRat(byte iloscRat) {
		this.iloscRat = iloscRat;
	}

	public String getKto() {
		return this.kto;
	}

	public void setKto(String kto) {
		this.kto = kto;
	}

	public String getNrPolisa() {
		return this.nrPolisa;
	}

	public void setNrPolisa(String nrPolisa) {
		this.nrPolisa = nrPolisa;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public BigDecimal getSumaSkladka() {
		return this.sumaSkladka;
	}

	public void setSumaSkladka(BigDecimal sumaSkladka) {
		this.sumaSkladka = sumaSkladka;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

}