package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domain.Miasto;
import com.alium.ic.domain.Panstwo;

@Stateless
public class MiastoManager {
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Miasto> getMiasto() {
		// zapytanue w EntityManager nazwa, i metoda
		return em.createNamedQuery("wszystkie.miasta").getResultList();
	}

	public void addMiasto(Miasto city) {

		boolean duplicat = false;
		// pobiera liste z bazy danych wywołując metode powyzej getMiasto() {
		// return...
		List<Miasto> miasta = getMiasto();
		for (Miasto element : miasta) {
			if (city.getNazwa().equals(element.getNazwa()))
				duplicat = true;
		}

		if (duplicat != true) {
			city.setId(null); // baza danych sama nadała klucz
			em.persist(city); // entity manager (persist- informuje o polaczeniu
								// do bazy danych- tu dodanie city
		}
	}

	public void deleteCity(Miasto city) {
		city = em.find(Miasto.class, city.getId());
		em.remove(city);
	}
	
	public void  updateCity(Miasto city){
		Miasto updateCity=em.find(Miasto.class, city.getId());
		updateCity.setNazwa(city.getNazwa());	
	}
}