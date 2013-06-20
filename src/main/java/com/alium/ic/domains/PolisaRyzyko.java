package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the polisa_ryzyko database table.
 * 
 */
@Entity
@Table(name="polisa_ryzyko")
public class PolisaRyzyko implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String op;

	private BigDecimal skladka;

	private BigDecimal suma;

	private Timestamp wd;

	//bi-directional many-to-one association to Polisa
	@ManyToOne
	@JoinColumn(name="id_polisa")
	private Polisa polisa;

	//bi-directional many-to-one association to SlowRyzyko
	@ManyToOne
	@JoinColumn(name="id_ryzyko")
	private SlowRyzyko slowRyzyko;

	//bi-directional many-to-one association to PolisaRyzykoElem
	@OneToMany(mappedBy="polisaRyzyko")
	private Set<PolisaRyzykoElem> polisaRyzykoElems;

	public PolisaRyzyko() {
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

	public BigDecimal getSkladka() {
		return this.skladka;
	}

	public void setSkladka(BigDecimal skladka) {
		this.skladka = skladka;
	}

	public BigDecimal getSuma() {
		return this.suma;
	}

	public void setSuma(BigDecimal suma) {
		this.suma = suma;
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

	public SlowRyzyko getSlowRyzyko() {
		return this.slowRyzyko;
	}

	public void setSlowRyzyko(SlowRyzyko slowRyzyko) {
		this.slowRyzyko = slowRyzyko;
	}

	public Set<PolisaRyzykoElem> getPolisaRyzykoElems() {
		return this.polisaRyzykoElems;
	}

	public void setPolisaRyzykoElems(Set<PolisaRyzykoElem> polisaRyzykoElems) {
		this.polisaRyzykoElems = polisaRyzykoElems;
	}

	public PolisaRyzykoElem addPolisaRyzykoElem(PolisaRyzykoElem polisaRyzykoElem) {
		getPolisaRyzykoElems().add(polisaRyzykoElem);
		polisaRyzykoElem.setPolisaRyzyko(this);

		return polisaRyzykoElem;
	}

	public PolisaRyzykoElem removePolisaRyzykoElem(PolisaRyzykoElem polisaRyzykoElem) {
		getPolisaRyzykoElems().remove(polisaRyzykoElem);
		polisaRyzykoElem.setPolisaRyzyko(null);

		return polisaRyzykoElem;
	}

}