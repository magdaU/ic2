package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the obiekt database table.
 * 
 */
@Entity
public class Obiekt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="id_obi")
	private int idObi;

	private String op;

	private String rodzaj;

	private Timestamp wd;

	//bi-directional many-to-one association to Polisa
	@OneToMany(mappedBy="obiekt")
	private Set<Polisa> polisas;

	//bi-directional many-to-one association to PolisaRyzykoElem
	@OneToMany(mappedBy="obiekt")
	private Set<PolisaRyzykoElem> polisaRyzykoElems;

	public Obiekt() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdObi() {
		return this.idObi;
	}

	public void setIdObi(int idObi) {
		this.idObi = idObi;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getRodzaj() {
		return this.rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

	public Set<Polisa> getPolisas() {
		return this.polisas;
	}

	public void setPolisas(Set<Polisa> polisas) {
		this.polisas = polisas;
	}

	public Polisa addPolisa(Polisa polisa) {
		getPolisas().add(polisa);
		polisa.setObiekt(this);

		return polisa;
	}

	public Polisa removePolisa(Polisa polisa) {
		getPolisas().remove(polisa);
		polisa.setObiekt(null);

		return polisa;
	}

	public Set<PolisaRyzykoElem> getPolisaRyzykoElems() {
		return this.polisaRyzykoElems;
	}

	public void setPolisaRyzykoElems(Set<PolisaRyzykoElem> polisaRyzykoElems) {
		this.polisaRyzykoElems = polisaRyzykoElems;
	}

	public PolisaRyzykoElem addPolisaRyzykoElem(PolisaRyzykoElem polisaRyzykoElem) {
		getPolisaRyzykoElems().add(polisaRyzykoElem);
		polisaRyzykoElem.setObiekt(this);

		return polisaRyzykoElem;
	}

	public PolisaRyzykoElem removePolisaRyzykoElem(PolisaRyzykoElem polisaRyzykoElem) {
		getPolisaRyzykoElems().remove(polisaRyzykoElem);
		polisaRyzykoElem.setObiekt(null);

		return polisaRyzykoElem;
	}

}