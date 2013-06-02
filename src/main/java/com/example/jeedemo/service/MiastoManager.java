package com.example.jeedemo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.jeedemo.domain.Miasto;
import com.example.jeedemo.domain.Panstwo;


@Stateless
public class MiastoManager {
	@PersistenceContext
	EntityManager mm;
	
	@SuppressWarnings("unchecked")
	public List<Miasto> getMiasto()
	{ 
		//zapytanue w EntityManager nazwa, i metoda
		return mm.createNamedQuery("wszystkie.miasta").getResultList();
		
	}
	


}
