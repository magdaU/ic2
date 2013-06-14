package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domain.Miasto;
import com.alium.ic.domain.Panstwo;


@Stateless
public class PanstwoManager {
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Panstwo> getPanstwa()
	{ 
		
		//zapytanue w EntityManager nazwa, i metoda
		return em.createNamedQuery("panstwa.wszystkie").getResultList();	
	}
	public void addPanstwo(Panstwo country) {

		boolean duplicat = false;
		// pobiera liste z bazy danych wywołując metode powyzej getMiasto() {
		// return...
		List<Panstwo> panstwa = getPanstwa();
		for (Panstwo element : panstwa) {
			if (country.getNazwa().equals(element.getNazwa()))
				duplicat = true;
		}

		if (duplicat != true) {
			country.setId(null); // baza danych sama nadała klucz
			em.persist(country); // entity manager (persist- informuje o polaczeniu
								// do bazy danych- tu dodanie city
		}
	}

	public void deleteCountry(Panstwo country) {
		country = em.find(Panstwo.class, country.getId());
		em.remove(country);
	}
	
	public void  updatePanstwo(Panstwo country){
		Panstwo updateCountry=em.find(Panstwo.class, country.getId());
		updateCountry.setNazwa(country.getNazwa());	
	}
}
	



