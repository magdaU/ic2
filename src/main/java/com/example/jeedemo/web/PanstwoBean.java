package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Panstwo;
import com.example.jeedemo.service.PanstwoManager;

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
}
