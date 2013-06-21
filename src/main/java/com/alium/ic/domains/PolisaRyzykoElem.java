package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the polisa_ryzyko_elem database table.
 * 
 */
@Entity 
@Table(name="polisa_ryzyko_elem")
public class PolisaRyzykoElem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to Obiekt
	@ManyToOne
	@JoinColumn(name="id_obiekt")
	private Obiekt obiekt;

	//bi-directional many-to-one association to PolisaRyzyko
	@ManyToOne
	@JoinColumn(name="id_ryzyko")
	private PolisaRyzyko polisaRyzyko;

	public PolisaRyzykoElem() {
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

	public Obiekt getObiekt() {
		return this.obiekt;
	}

	public void setObiekt(Obiekt obiekt) {
		this.obiekt = obiekt;
	}

	public PolisaRyzyko getPolisaRyzyko() {
		return this.polisaRyzyko;
	}

	public void setPolisaRyzyko(PolisaRyzyko polisaRyzyko) {
		this.polisaRyzyko = polisaRyzyko;
	}

}