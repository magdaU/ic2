package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the slow_ryzyko database table.
 * 
 */
@Entity 
@Table(name="slow_ryzyko")
public class SlowRyzyko implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String kod;

	private String opis;

	//bi-directional many-to-one association to PolisaRyzyko
	@OneToMany(mappedBy="slowRyzyko")
	private Set<PolisaRyzyko> polisaRyzykos;

	public SlowRyzyko() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKod() {
		return this.kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<PolisaRyzyko> getPolisaRyzykos() {
		return this.polisaRyzykos;
	}

	public void setPolisaRyzykos(Set<PolisaRyzyko> polisaRyzykos) {
		this.polisaRyzykos = polisaRyzykos;
	}

	public PolisaRyzyko addPolisaRyzyko(PolisaRyzyko polisaRyzyko) {
		getPolisaRyzykos().add(polisaRyzyko);
		polisaRyzyko.setSlowRyzyko(this);

		return polisaRyzyko;
	}

	public PolisaRyzyko removePolisaRyzyko(PolisaRyzyko polisaRyzyko) {
		getPolisaRyzykos().remove(polisaRyzyko);
		polisaRyzyko.setSlowRyzyko(null);

		return polisaRyzyko;
	}

}