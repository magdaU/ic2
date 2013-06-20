package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the agencja_umowa database table.
 * 
 */
@Entity
@Table(name="agencja_umowa")
public class AgencjaUmowa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_zawar")
	private Date dataZawar;

	@Column(name="id_umowa_aktualna")
	private int idUmowaAktualna;

	@Column(name="nr_umowy")
	private String nrUmowy;

	private String op;

	private int prowizja;

	private Timestamp wd;

	//bi-directional many-to-one association to AgencjaObszUm
	@OneToMany(mappedBy="agencjaUmowa")
	private Set<AgencjaObszUm> agencjaObszUms;

	//bi-directional many-to-one association to Agencja
	@ManyToOne
	@JoinColumn(name="id_agencja")
	private Agencja agencja;

	public AgencjaUmowa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataZawar() {
		return this.dataZawar;
	}

	public void setDataZawar(Date dataZawar) {
		this.dataZawar = dataZawar;
	}

	public int getIdUmowaAktualna() {
		return this.idUmowaAktualna;
	}

	public void setIdUmowaAktualna(int idUmowaAktualna) {
		this.idUmowaAktualna = idUmowaAktualna;
	}

	public String getNrUmowy() {
		return this.nrUmowy;
	}

	public void setNrUmowy(String nrUmowy) {
		this.nrUmowy = nrUmowy;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getProwizja() {
		return this.prowizja;
	}

	public void setProwizja(int prowizja) {
		this.prowizja = prowizja;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

	public Set<AgencjaObszUm> getAgencjaObszUms() {
		return this.agencjaObszUms;
	}

	public void setAgencjaObszUms(Set<AgencjaObszUm> agencjaObszUms) {
		this.agencjaObszUms = agencjaObszUms;
	}

	public AgencjaObszUm addAgencjaObszUm(AgencjaObszUm agencjaObszUm) {
		getAgencjaObszUms().add(agencjaObszUm);
		agencjaObszUm.setAgencjaUmowa(this);

		return agencjaObszUm;
	}

	public AgencjaObszUm removeAgencjaObszUm(AgencjaObszUm agencjaObszUm) {
		getAgencjaObszUms().remove(agencjaObszUm);
		agencjaObszUm.setAgencjaUmowa(null);

		return agencjaObszUm;
	}

	public Agencja getAgencja() {
		return this.agencja;
	}

	public void setAgencja(Agencja agencja) {
		this.agencja = agencja;
	}

}