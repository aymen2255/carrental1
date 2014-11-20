package fr.treeptik.pojo;

import java.util.List;

public class Client {
	private int codecl;
	private String nomcl;
	private String adresse;
	private String Ville;
	private List<Contrat> listContrats;
	
	
	
	
	public Client() {
		super();
	}
	public Client(String nomcl, String adresse, String ville) {
		super();
		this.nomcl = nomcl;
		this.adresse = adresse;
		Ville = ville;
	}
	public int getCodecl() {
		return codecl;
	}
	public void setCodecl(int codecl) {
		this.codecl = codecl;
	}
	public String getNomcl() {
		return nomcl;
	}
	public void setNomcl(String nomcl) {
		this.nomcl = nomcl;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public List<Contrat> getListContrats() {
		return listContrats;
	}
	public void setListContrats(List<Contrat> listContrats) {
		this.listContrats = listContrats;
	}
	
	
}
