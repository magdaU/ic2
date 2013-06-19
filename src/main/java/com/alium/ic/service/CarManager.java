package com.alium.ic.service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domain.Car;

@Stateless
public class CarManager {
	
	@PersistenceContext
	EntityManager em;
	
	public void addCar(Car auto){
	auto.setId(null);
	auto.setSold(null);
	em.persist(auto);
	}
	@SuppressWarnings("unchecked")
	public List<Car> getAllCars(){
		return em.createNamedQuery("car.all").getResultList();			
	}
}
