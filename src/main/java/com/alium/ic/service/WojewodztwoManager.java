package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domains.SlowWojewodztwo;

@Stateless 
public class WojewodztwoManager {
	
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	public List<SlowWojewodztwo> getWojewodztwa() {
		// zapytanue w EntityManager nazwa, i metoda
		return em.createNamedQuery("wszystkie.wojewodztwa").getResultList();
	}

	public void addWojewodztwo(SlowWojewodztwo woj) {

		boolean duplicat = false;
		// pobiera liste z bazy danych wywołując metode powyzej getMiasto() {
		// return...
		List<SlowWojewodztwo> wojewodztwa = getWojewodztwa();
		for (SlowWojewodztwo element : wojewodztwa) {
			if (woj.getWojewodztwo().equals(element.getWojewodztwo()))
				duplicat = true;
		}

		if (duplicat != true) {
			woj.setId(null); // baza danych sama nadała klucz
			em.persist(woj); // entity manager (persist- informuje o polaczeniu
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