package com.alium.ic.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.alium.ic.domain.Miasto;
import com.alium.ic.domain.Panstwo;
import com.alium.ic.service.PanstwoManager;

@SessionScoped
@Named("panstwoBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class PanstwoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Panstwo panstwo= new Panstwo();
	//model danych
	private ListDataModel<Panstwo> panstwa= new ListDataModel<Panstwo>();
	
	@Inject
	PanstwoManager pm;
	
	public Panstwo getPanstwo() {
		return panstwo;
	}
	public void setPanstwo(Panstwo panstwo) {
		this.panstwo = panstwo;
	}
	public ListDataModel<Panstwo> getPanstwa() {
		panstwa.setWrappedData(pm.getPanstwa());
		return panstwa;
	}
	
	public String addPanstwo(){
	pm.addPanstwo(panstwo); // w panstwo manager wywoluje metode addPanstwo z parametrem wejsciowym panstwp (->bean)
	return "showSlownik"; // przekierowuje na strone showSlownik
	}
	public String deleteCountry(){
	Panstwo countryToDelete= panstwa.getRowData();
	pm.deleteCountry(countryToDelete);
	return null;
	}
	// akcja
    public String editPanstwo(){
	panstwo = new Panstwo(); // Panstwo - klasa , a nie lista 
	panstwo = panstwa.getRowData();
	return "editPanstwo";
	
    }
    public String updatePanstwo(){
	pm.updatePanstwo(panstwo);
	panstwo = new Panstwo();
	return "showSlownik";
	}
}
