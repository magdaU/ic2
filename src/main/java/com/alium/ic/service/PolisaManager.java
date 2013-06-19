package com.alium.ic.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.alium.ic.domain.Car;

@Stateless
public class PolisaManager {
	
	@PersistenceContext
	EntityManager psm;
	
	

}