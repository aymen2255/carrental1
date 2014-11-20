package fr.treeptik.pojo;

import java.util.Date;
import java.util.List;

public class Contrat {
private int nocontrat;
private Date date_Contrat;
private Date ate_enlevement;
private Date date_retour;
private int codecl;
private List<Voiture> listeVoitures;
public int getNocontrat() {
	return nocontrat;
}
public void setNocontrat(int nocontrat) {
	this.nocontrat = nocontrat;
}
public Date getDate_Contrat() {
	return date_Contrat;
}
public void setDate_Contrat(Date date_Contrat) {
	this.date_Contrat = date_Contrat;
}
public Date getAte_enlevement() {
	return ate_enlevement;
}
public void setAte_enlevement(Date ate_enlevement) {
	this.ate_enlevement = ate_enlevement;
}
public Date getDate_retour() {
	return date_retour;
}
public void setDate_retour(Date date_retour) {
	this.date_retour = date_retour;
}
public int getCodecl() {
	return codecl;
}
public void setCodecl(int codecl) {
	this.codecl = codecl;
}
public List<Voiture> getListeVoitures() {
	return listeVoitures;
}
public void setListeVoitures(List<Voiture> listeVoitures) {
	this.listeVoitures = listeVoitures;
}

}
