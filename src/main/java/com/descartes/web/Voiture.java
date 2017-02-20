package com.descartes.web;

public class Voiture {
	
	String immatriculation;
	String marque;

	public Voiture(String immatriculation, String marque) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
	}

	public Voiture() {
		super();
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


}
