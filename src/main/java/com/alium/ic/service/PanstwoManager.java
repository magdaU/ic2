package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domains.SlowPanstwo;


@Stateless 
public class PanstwoManager {
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<SlowPanstwo> getPanstwa()
	{ 
		
		//zapytanue w EntityManager nazwa, i metoda
		return em.createNamedQuery("panstwa.wszystkie").getResultList();	
	}
	public void addPanstwo(SlowPanstwo country) {

		boolean duplicat = false;
		// pobiera liste z bazy danych wywołując metode powyzej getMiasto() {
		// return...
		List<SlowPanstwo> panstwa = getPanstwa();
		for (SlowPanstwo element : panstwa) {
			if (country.getKraj().equals(element.getKraj()))
				duplicat = true;
		}

		if (duplicat != true) {
			country.setId(null); // baza danych sama nadała klucz
			em.persist(country); // entity manager (persist- informuje o polaczeniu
								// do bazy danych- tu dodanie city
		}
	}

	public void deleteCountry(SlowPanstwo country) {
		country = em.find(SlowPanstwo.class, country.getId());
		em.remove(country);
	}
	
	public void  updatePanstwo(SlowPanstwo country){
		SlowPanstwo updateCountry=em.find(SlowPanstwo.class, country.getId());
		updateCountry.setKraj(country.getKraj());	
	}
}
	



