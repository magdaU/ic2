package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the polisa_raty database table.
 * 
 */
@Entity 
@Table(name="polisa_raty")
public class PolisaRaty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_wymag")
	private Date dataWymag;

	private BigDecimal kwota;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to Polisa
	@ManyToOne
	@JoinColumn(name="id_polisa")
	private Polisa polisa;

	public PolisaRaty() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataWymag() {
		return this.dataWymag;
	}

	public void setDataWymag(Date dataWymag) {
		this.dataWymag = dataWymag;
	}

	public BigDecimal getKwota() {
		return this.kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
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