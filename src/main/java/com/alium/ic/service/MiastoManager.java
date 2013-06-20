package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domains.SlowMiasto;
import com.alium.ic.domains.SlowPanstwo;

@Stateless
public class MiastoManager {
	
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	public List<SlowMiasto> getMiasto() {
		// zapytanue w EntityManager nazwa, i metoda
		return em.createNamedQuery("wszystkie.miasta").getResultList();
	}

	public void addMiasto(SlowMiasto city) {

		boolean duplicat = false;
		// pobiera liste z bazy danych wywołując metode powyzej getMiasto() {
		// return...
		List<SlowMiasto> miasta = getMiasto();
		for (SlowMiasto element : miasta) {
			if (city.getMiasto().equals(element.getMiasto()))
				duplicat = true;
		}

		if (duplicat != true) {
			city.setId((Integer) null); // baza danych sama nadała klucz
			em.persist(city); // entity manager (persist- informuje o polaczeniu
								// do bazy danych- tu dodanie city
		}
	}

/*	public void deleteCity(Miasto city) {
		city = em.find(Miasto.class, city.getId());
		em.remove(city);
	}
	
	public void  updateCity(Miasto city){
		Miasto updateCity=em.find(Miasto.class, city.getId());
		updateCity.setNazwa(city.getNazwa());	
	}*/
}