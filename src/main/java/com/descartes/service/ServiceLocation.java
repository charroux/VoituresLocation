package com.descartes.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.descartes.domain.Voiture;

public class ServiceLocation {
	
	EntityManager entityManager;
	
	public ServiceLocation(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}
	
	/**
	 * Réception d'une voiture venant du web servie,
	 * création d'une voiture JPA et sauvegarde dans la base de données.
	 * @param voiture
	 */
	public void ajouterVoiture(com.descartes.web.Voiture voiture){
		com.descartes.domain.Voiture voitureJPA = new com.descartes.domain.Voiture(voiture);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(voitureJPA);
		tx.commit();
	}
	
	/**
	 * Recherche dans la base de données des voitures JPA et création d'une liste de voiture 
	 * (Data Transfert Object) pour retourner au web service.
	 * @return
	 */
	
	public List<com.descartes.web.Voiture> listerVoitures(){
		List voituresJPA = entityManager.createQuery("select v from Voiture v").getResultList();
		List<com.descartes.web.Voiture> voituresDTO = new ArrayList<com.descartes.web.Voiture>();
		com.descartes.domain.Voiture jpa;
		for(int i=0; i<voituresJPA.size(); i++){
			jpa = (Voiture) voituresJPA.get(i);
			com.descartes.web.Voiture dto = new com.descartes.web.Voiture(jpa.getImmatriculation(), jpa.getMarque());
			voituresDTO.add(dto);
		}
		return voituresDTO;
	}
	
	// ... 

}
