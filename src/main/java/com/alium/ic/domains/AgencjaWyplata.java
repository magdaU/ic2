package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the agencja_wyplata database table.
 * 
 */
@Entity 
@Table(name="agencja_wyplata")
public class AgencjaWyplata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="kwota_pro")
	private BigDecimal kwotaPro;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to Agencja
	@ManyToOne
	@JoinColumn(name="id_agencja")
	private Agencja agencja;

	//bi-directional many-to-one association to Polisa
	@ManyToOne
	@JoinColumn(name="id_polisa")
	private Polisa polisa;

	public AgencjaWyplata() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getKwotaPro() {
		return this.kwotaPro;
	}

	public void setKwotaPro(BigDecimal kwotaPro) {
		this.kwotaPro = kwotaPro;
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

	public Agencja getAgencja() {
		return this.agencja;
	}

	public void setAgencja(Agencja agencja) {
		this.agencja = agencja;
	}

	public Polisa getPolisa() {
		return this.polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}

}