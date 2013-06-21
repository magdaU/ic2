package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_model database table.
 * 
 */
@Entity 
@Table(name="slow_model")
public class SlowModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String model;

	//bi-directional many-to-one association to ObiektSamochod
	@OneToMany(mappedBy="slowModel")
	private Set<ObiektSamochod> obiektSamochods;

	public SlowModel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Set<ObiektSamochod> getObiektSamochods() {
		return this.obiektSamochods;
	}

	public void setObiektSamochods(Set<ObiektSamochod> obiektSamochods) {
		this.obiektSamochods = obiektSamochods;
	}

	public ObiektSamochod addObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().add(obiektSamochod);
		obiektSamochod.setSlowModel(this);

		return obiektSamochod;
	}

	public ObiektSamochod removeObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().remove(obiektSamochod);
		obiektSamochod.setSlowModel(null);

		return obiektSamochod;
	}

}