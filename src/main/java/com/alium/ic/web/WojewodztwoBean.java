package com.alium.ic.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.alium.ic.domains.SlowWojewodztwo;
import com.alium.ic.service.WojewodztwoManager;

@SessionScoped
@Named("wojewodztwoBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class WojewodztwoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	// bean-miasto (obiekt)
	private SlowWojewodztwo wojewodztwo = new SlowWojewodztwo();
	//model danych
	private ListDataModel<SlowWojewodztwo> wojewodztwa = new ListDataModel<SlowWojewodztwo>();
	
	@Inject
	WojewodztwoManager wm;
	
	public SlowWojewodztwo getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(SlowWojewodztwo wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public ListDataModel<SlowWojewodztwo> getWojewodztwa() {
		wojewodztwa.setWrappedData(wm.getWojewodztwa());
		return wojewodztwa;
	}	
	
	public String addWojewodztwo(){
		wm.addWojewodztwo(wojewodztwo); // w miasto manager wywoluje metode addMiasto z parametrem wejsciowym miasto (->bean)
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
