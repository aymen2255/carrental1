package fr.treeptik.pojo;

import java.util.Date;
import java.util.List;

public class Reparations {
	private int numRep;
	private Date date_Rep;
	private String description_Panne;
	private float  montant_repa;
	private List<Voiture> listeVoitures;
	public int getNumRep() {
		return numRep;
	}
	public void setNumRep(int numRep) {
		this.numRep = numRep;
	}
	public Date getDate_Rep() {
		return date_Rep;
	}
	public void setDate_Rep(Date date_Rep) {
		this.date_Rep = date_Rep;
	}
	public String getDescription_Panne() {
		return description_Panne;
	}
	public void setDescription_Panne(String description_Panne) {
		this.description_Panne = description_Panne;
	}
	public float getMontant_repa() {
		return montant_repa;
	}
	public void setMontant_repa(float montant_repa) {
		this.montant_repa = montant_repa;
	}
	public List<Voiture> getListeVoitures() {
		return listeVoitures;
	}
	public void setListeVoitures(List<Voiture> listeVoitures) {
		this.listeVoitures = listeVoitures;
	}
	
}
