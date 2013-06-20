package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the polisa_oplacenie database table.
 * 
 */
@Entity
@Table(name="polisa_oplacenie")
public class PolisaOplacenie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private BigDecimal inkaso;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to Polisa
	@ManyToOne
	@JoinColumn(name="id_polisa")
	private Polisa polisa;

	public PolisaOplacenie() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getInkaso() {
		return this.inkaso;
	}

	public void setInkaso(BigDecimal inkaso) {
		this.inkaso = inkaso;
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

	public Polisa getPolisa() {
		return this.polisa;
	}

	public void setPolisa(Polisa polisa) {
		this.polisa = polisa;
	}

}