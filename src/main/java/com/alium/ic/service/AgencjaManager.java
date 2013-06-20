package com.alium.ic.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domains.Agencja;
import com.alium.ic.domains.SlowMiasto;
import com.alium.ic.domains.SlowPanstwo;
import com.alium.ic.domains.SlowWojewodztwo;


@Stateless
public class AgencjaManager {

	@PersistenceContext
	EntityManager em;
	
	public void addAgencja(Agencja agencja, Integer id, Long wojId, Long krajId) {
		SlowMiasto miasto = em.find(SlowMiasto.class, id);
		SlowWojewodztwo woj = em.find(SlowWojewodztwo.class, wojId);
		SlowPanstwo kraj = em.find(SlowPanstwo.class, krajId);
		agencja.setId(null);
		agencja.setSlowMiasto(miasto);
		agencja.setSlowWojewodztwo(woj);
		agencja.setSlowKraj(kraj);
		em.persist(agencja);
	}

	@SuppressWarnings("unchecked")
	public List<Agencja> getAllAgencje() {
		return em.createNamedQuery("wszystkie.agencje").getResultList();
	}

/*	public List<Car> getOwnedCars(Person person) {
		person = em.find(Person.class, person.getId());
		// lazy loading here - try this code without this (shallow) copying
		List<Car> cars = new ArrayList<Car>(person.getCars());
		return cars;
	}*/

}
