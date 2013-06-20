package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_rodz_samochodu database table.
 * 
 */
@Entity
@Table(name="slow_rodz_samochodu")
public class SlowRodzSamochodu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nazwa;

	//bi-directional many-to-one association to ObiektSamochod
	@OneToMany(mappedBy="slowRodzSamochodu")
	private Set<ObiektSamochod> obiektSamochods;

	public SlowRodzSamochodu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Set<ObiektSamochod> getObiektSamochods() {
		return this.obiektSamochods;
	}

	public void setObiektSamochods(Set<ObiektSamochod> obiektSamochods) {
		this.obiektSamochods = obiektSamochods;
	}

	public ObiektSamochod addObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().add(obiektSamochod);
		obiektSamochod.setSlowRodzSamochodu(this);

		return obiektSamochod;
	}

	public ObiektSamochod removeObiektSamochod(ObiektSamochod obiektSamochod) {
		getObiektSamochods().remove(obiektSamochod);
		obiektSamochod.setSlowRodzSamochodu(null);

		return obiektSamochod;
	}

}