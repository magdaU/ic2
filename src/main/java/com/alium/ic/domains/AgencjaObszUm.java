package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the agencja_obsz_um database table.
 * 
 */
@Entity
@Table(name="agencja_obsz_um")
public class AgencjaObszUm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to SlowObszar
	@ManyToOne
	@JoinColumn(name="id_obszar")
	private SlowObszar slowObszar;

	//bi-directional many-to-one association to AgencjaUmowa
	@ManyToOne
	@JoinColumn(name="id_umowa")
	private AgencjaUmowa agencjaUmowa;

	public AgencjaObszUm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

	public SlowObszar getSlowObszar() {
		return this.slowObszar;
	}

	public void setSlowObszar(SlowObszar slowObszar) {
		this.slowObszar = slowObszar;
	}

	public AgencjaUmowa getAgencjaUmowa() {
		return this.agencjaUmowa;
	}

	public void setAgencjaUmowa(AgencjaUmowa agencjaUmowa) {
		this.agencjaUmowa = agencjaUmowa;
	}

}