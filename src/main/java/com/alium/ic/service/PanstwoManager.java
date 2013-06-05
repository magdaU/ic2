package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	


}
