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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((immatriculation == null) ? 0 : immatriculation.hashCode());
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (immatriculation == null) {
			if (other.immatriculation != null)
				return false;
		} else if (!immatriculation.equals(other.immatriculation))
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		return true;
	}

	
}
