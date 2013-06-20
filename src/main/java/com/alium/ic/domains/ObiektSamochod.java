package com.alium.ic.domains;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the obiekt_samochod database table.
 * 
 */
@Entity
@Table(name="obiekt_samochod")
public class ObiektSamochod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="data_rej")
	private Date dataRej;

	@Column(name="masa_sam")
	private int masaSam;

	@Column(name="nr_rej")
	private String nrRej;

	@Column(name="nr_vin")
	private String nrVin;

	private String op;

	@Column(name="poj_silnik")
	private int pojSilnik;

	@Column(name="rok_prod")
	private int rokProd;

	private Timestamp wd;

	//bi-directional many-to-one association to SlowMarka
	@ManyToOne
	@JoinColumn(name="id_sl_marka")
	private SlowMarka slowMarka;

	//bi-directional many-to-one association to SlowModel
	@ManyToOne
	@JoinColumn(name="id_sl_model")
	private SlowModel slowModel;

	//bi-directional many-to-one association to SlowRodzSamochodu
	@ManyToOne
	@JoinColumn(name="id_sl_rodz")
	private SlowRodzSamochodu slowRodzSamochodu;

	public ObiektSamochod() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataRej() {
		return this.dataRej;
	}

	public void setDataRej(Date dataRej) {
		this.dataRej = dataRej;
	}

	public int getMasaSam() {
		return this.masaSam;
	}

	public void setMasaSam(int masaSam) {
		this.masaSam = masaSam;
	}

	public String getNrRej() {
		return this.nrRej;
	}

	public void setNrRej(String nrRej) {
		this.nrRej = nrRej;
	}

	public String getNrVin() {
		return this.nrVin;
	}

	public void setNrVin(String nrVin) {
		this.nrVin = nrVin;
	}

	public String getOp() {
		return this.op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getPojSilnik() {
		return this.pojSilnik;
	}

	public void setPojSilnik(int pojSilnik) {
		this.pojSilnik = pojSilnik;
	}

	public int getRokProd() {
		return this.rokProd;
	}

	public void setRokProd(int rokProd) {
		this.rokProd = rokProd;
	}

	public Timestamp getWd() {
		return this.wd;
	}

	public void setWd(Timestamp wd) {
		this.wd = wd;
	}

	public SlowMarka getSlowMarka() {
		return this.slowMarka;
	}

	public void setSlowMarka(SlowMarka slowMarka) {
		this.slowMarka = slowMarka;
	}

	public SlowModel getSlowModel() {
		return this.slowModel;
	}

	public void setSlowModel(SlowModel slowModel) {
		this.slowModel = slowModel;
	}

	public SlowRodzSamochodu getSlowRodzSamochodu() {
		return this.slowRodzSamochodu;
	}

	public void setSlowRodzSamochodu(SlowRodzSamochodu slowRodzSamochodu) {
		this.slowRodzSamochodu = slowRodzSamochodu;
	}

}