package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the polisa database table.
 * 
 */
@Entity
public class Polisa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_do")
	private Date dataDo;

	@Temporal(TemporalType.DATE)
	@Column(name="data_od")
	private Date dataOd;

	@Temporal(TemporalType.DATE)
	@Column(name="data_zawarcia")
	private Date dataZawarcia;

	@Column(name="ilosc_rat")
	private byte iloscRat;

	@Column(name="nr_polisa")
	private String nrPolisa;

	private String op;

	private Timestamp wd;

	//bi-directional many-to-one association to AgencjaWyplata
	@OneToMany(mappedBy="polisa")
	private Set<AgencjaWyplata> agencjaWyplatas;

	//bi-directional many-to-one association to Agencja
	@ManyToOne
	@JoinColumn(name="id_agencja")
	private Agencja agencja;

	//bi-directional many-to-one association to Obiekt
	@ManyToOne
	@JoinColumn(name="id_osoba")
	private Obiekt obiekt;

	//bi-directional many-to-one association to PolisaOplacenie
	@OneToMany(mappedBy="polisa")
	private Set<PolisaOplacenie> polisaOplacenies;

	//bi-directional many-to-one association to PolisaRaty
	@OneToMany(mappedBy="polisa")
	private Set<PolisaRaty> polisaRaties;

	//bi-directional many-to-one association to PolisaRyzyko
	@OneToMany(mappedBy="polisa")
	private Set<PolisaRyzyko> polisaRyzykos;

	public Polisa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataDo() {
		return this.dataDo;
	}

	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}

	public Date getDataOd() {
		return this.dataOd;
	}

	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}

	public Date getDataZawarcia() {
		return this.dataZawarcia;
	}

	public void setDataZawarcia(Date dataZawarcia) {
		this.dataZawarcia = dataZawarcia;
	}

	public byte getIloscRat() {
		return this.iloscRat;
	}

	public void setIloscRat(byte iloscRat) {
		this.iloscRat = iloscRat;
	}

	public String getNrPolisa() {
		return this.nrPolisa;
	}

	public void setNrPolisa(String nrPolisa) {
		this.nrPolisa = nrPolisa;
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

	public Set<AgencjaWyplata> getAgencjaWyplatas() {
		return this.agencjaWyplatas;
	}

	public void setAgencjaWyplatas(Set<AgencjaWyplata> agencjaWyplatas) {
		this.agencjaWyplatas = agencjaWyplatas;
	}

	public AgencjaWyplata addAgencjaWyplata(AgencjaWyplata agencjaWyplata) {
		getAgencjaWyplatas().add(agencjaWyplata);
		agencjaWyplata.setPolisa(this);

		return agencjaWyplata;
	}

	public AgencjaWyplata removeAgencjaWyplata(AgencjaWyplata agencjaWyplata) {
		getAgencjaWyplatas().remove(agencjaWyplata);
		agencjaWyplata.setPolisa(null);

		return agencjaWyplata;
	}

	public Agencja getAgencja() {
		return this.agencja;
	}

	public void setAgencja(Agencja agencja) {
		this.agencja = agencja;
	}

	public Obiekt getObiekt() {
		return this.obiekt;
	}

	public void setObiekt(Obiekt obiekt) {
		this.obiekt = obiekt;
	}

	public Set<PolisaOplacenie> getPolisaOplacenies() {
		return this.polisaOplacenies;
	}

	public void setPolisaOplacenies(Set<PolisaOplacenie> polisaOplacenies) {
		this.polisaOplacenies = polisaOplacenies;
	}

	public PolisaOplacenie addPolisaOplaceny(PolisaOplacenie polisaOplaceny) {
		getPolisaOplacenies().add(polisaOplaceny);
		polisaOplaceny.setPolisa(this);

		return polisaOplaceny;
	}

	public PolisaOplacenie removePolisaOplaceny(PolisaOplacenie polisaOplaceny) {
		getPolisaOplacenies().remove(polisaOplaceny);
		polisaOplaceny.setPolisa(null);

		return polisaOplaceny;
	}

	public Set<PolisaRaty> getPolisaRaties() {
		return this.polisaRaties;
	}

	public void setPolisaRaties(Set<PolisaRaty> polisaRaties) {
		this.polisaRaties = polisaRaties;
	}

	public PolisaRaty addPolisaRaty(PolisaRaty polisaRaty) {
		getPolisaRaties().add(polisaRaty);
		polisaRaty.setPolisa(this);

		return polisaRaty;
	}

	public PolisaRaty removePolisaRaty(PolisaRaty polisaRaty) {
		getPolisaRaties().remove(polisaRaty);
		polisaRaty.setPolisa(null);

		return polisaRaty;
	}

	public Set<PolisaRyzyko> getPolisaRyzykos() {
		return this.polisaRyzykos;
	}

	public void setPolisaRyzykos(Set<PolisaRyzyko> polisaRyzykos) {
		this.polisaRyzykos = polisaRyzykos;
	}

	public PolisaRyzyko addPolisaRyzyko(PolisaRyzyko polisaRyzyko) {
		getPolisaRyzykos().add(polisaRyzyko);
		polisaRyzyko.setPolisa(this);

		return polisaRyzyko;
	}

	public PolisaRyzyko removePolisaRyzyko(PolisaRyzyko polisaRyzyko) {
		getPolisaRyzykos().remove(polisaRyzyko);
		polisaRyzyko.setPolisa(null);

		return polisaRyzyko;
	}

}