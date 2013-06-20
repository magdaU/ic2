package com.alium.ic.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.alium.ic.domains.Agencja;
import com.alium.ic.domains.SlowMiasto;
import com.alium.ic.domains.SlowPanstwo;
import com.alium.ic.domains.SlowWojewodztwo;
import com.alium.ic.service.AgencjaManager;
import com.alium.ic.service.MiastoManager;
import com.alium.ic.service.PanstwoManager;
import com.alium.ic.service.WojewodztwoManager;

@SessionScoped
@Named("agencjaBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class AgencjaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	// bean-miasto (obiekt)
	private Agencja agencja = new Agencja ();
	//model danych
	private ListDataModel<Agencja> agencje = new ListDataModel<Agencja>();
	private Integer miastoId;
	private Long krajId;
	private Long wojId;
	


	@Inject
	AgencjaManager am;
	
	@Inject
	MiastoManager mm;
	
	@Inject
	WojewodztwoManager wm;
	
	@Inject
	PanstwoManager pm;
	
	public Long getKrajId() {
		return krajId;
	}

	public void setKrajId(Long krajId) {
		this.krajId = krajId;
	}

	public Long getWojId() {
		return wojId;
	}

	public void setWojId(Long wojId) {
		this.wojId = wojId;
	}

	public Integer getMiastoId() {
		return miastoId;
	}

	public void setMiastoId(Integer miastoId) {
		this.miastoId = miastoId;
	}
	
	public Agencja getAgencja() {
		return agencja;
	}

	public void setAgencja(Agencja agencja) {
		this.agencja = agencja;
	}

	public ListDataModel<Agencja> getAgencje() {
		agencje.setWrappedData(am.getAllAgencje());
		return agencje;
	}
	
	
	public List<SlowMiasto> getMiasta() {
		return mm.getMiasto();
	}

	public List<SlowWojewodztwo> getWojewodztwa() {
		return wm.getWojewodztwa();
	}

	public List<SlowPanstwo> getPanstwa() {
		return pm.getPanstwa();
	}

	public String addAgencja(){
		am.addAgencja(agencja, miastoId, wojId, krajId); // w miasto manager wywoluje metode addMiasto z parametrem wejsciowym miasto (->bean)
		return null; // przekierowuje na strone showSlownik
	}
	/*public String deleteCity(){
		Miasto cityToDelete= miasta.getRowData();
		mm.deleteCity(cityToDelete);
		return null;
	}
	// akcja
	public String editMiasto(){
		miasto = new Miasto(); // Miasto - klasa , a nie lista 
		miasto = miasta.getRowData();
		return "editMiasto";
		
	}
	public String updateMiasto(){
		mm.updateCity(miasto);
		miasto = new Miasto();
		return "showSlownik";
		
	}*/

	
}
