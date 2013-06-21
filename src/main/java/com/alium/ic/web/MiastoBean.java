package com.alium.ic.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.alium.ic.domains.SlowMiasto;
import com.alium.ic.service.MiastoManager;

@SessionScoped 
@Named("miastoBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class MiastoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	// bean-miasto (obiekt)
	private SlowMiasto miasto= new SlowMiasto();
	//model danych
	private ListDataModel<SlowMiasto> miasta= new ListDataModel<SlowMiasto>();
	
	@Inject
	MiastoManager mm;
	
	public SlowMiasto getMiasto() {
		return miasto;
	}
	public void setMiasto(SlowMiasto miasto) {
		this.miasto = miasto;
	}
	public ListDataModel<SlowMiasto> getMiasta() {
		miasta.setWrappedData(mm.getMiasto());
		return miasta;
	}	
	
	public String addMiasto(){
		mm.addMiasto(miasto); // w miasto manager wywoluje metode addMiasto z parametrem wejsciowym miasto (->bean)
		return "showSlownik"; // przekierowuje na strone showSlownik
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
