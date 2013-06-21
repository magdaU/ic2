package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_marka database table.
 * 
 */
@Entity 
@Table(name="slow_marka")
public class SlowMarka implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String marka;

	//bi-directional many-to-one association to ObiektSamochod
	@OneToMany(mappedBy="slowMarka")
	private Set<ObiektSamochod> obiektSamochods;

	public SlowMarka() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public Set<ObiektSamochod> getObiektSamochods() {
		return this.obiektSamochods;
	}

	public void setObiektSamochods(Set<ObiektSamochod> obiektSamochods) {
		this.obiektSamochods = obiektSamochods;
	}

	public ObiektSamochod addObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().add(obiektSamochod);
		obiektSamochod.setSlowMarka(this);

		return obiektSamochod;
	}

	public ObiektSamochod removeObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().remove(obiektSamochod);
		obiektSamochod.setSlowMarka(null);

		return obiektSamochod;
	}

}