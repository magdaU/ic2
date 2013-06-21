package com.alium.ic.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.alium.ic.domains.SlowPanstwo;
import com.alium.ic.service.PanstwoManager;

@SessionScoped 
@Named("panstwoBean") // nazwa Beana , nie musi byc taka sama jak nazwa klasy
public class PanstwoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private SlowPanstwo panstwo= new SlowPanstwo();
	//model danych
	private ListDataModel<SlowPanstwo> panstwa= new ListDataModel<SlowPanstwo>();
	
	@Inject
	PanstwoManager pm;
	
	public SlowPanstwo getPanstwo() {
		return panstwo;
	}
	public void setPanstwo(SlowPanstwo panstwo) {
		this.panstwo = panstwo;
	}
	public ListDataModel<SlowPanstwo> getPanstwa() {
		panstwa.setWrappedData(pm.getPanstwa());
		return panstwa;
	}
	
	public String addPanstwo(){
	pm.addPanstwo(panstwo); // w panstwo manager wywoluje metode addPanstwo z parametrem wejsciowym panstwp (->bean)
	return null; // przekierowuje na strone showSlownik
	}
	public String deleteCountry(){
	SlowPanstwo countryToDelete= panstwa.getRowData();
	pm.deleteCountry(countryToDelete);
	return null;
	}
	// akcja
    public String editPanstwo(){
	panstwo = new SlowPanstwo(); // Panstwo - klasa , a nie lista 
	panstwo = panstwa.getRowData();
	return "editPanstwo";
	
    }
    public String updatePanstwo(){
	pm.updatePanstwo(panstwo);
	panstwo = new SlowPanstwo();
	return "showSlownik";
	}
}