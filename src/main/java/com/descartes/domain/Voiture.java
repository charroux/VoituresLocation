package com.descartes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

	String immatriculation;
	String marque;
	long id;
	static int nombreLocations = 0;

	public Voiture (com.descartes.web.Voiture voiture){
		this.immatriculation = voiture.getImmatriculation();
		this.marque = voiture.getMarque();
		nombreLocations++;
	}
	
	public Voiture(String immatriculation, String marque) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
	}

	public Voiture() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	
	public static int getNombreLocations() {
		return nombreLocations;
	}

	public static void setNombreLocations(int nombreLocations) {
		Voiture.nombreLocations = nombreLocations;
	}

	
}
