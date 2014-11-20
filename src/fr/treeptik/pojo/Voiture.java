package fr.treeptik.pojo;

public class Voiture {
	private int noimmatriculation;
	private String marque;
	private String model;
	private String couleur;
	private String cumul_reparation;
	private String disponible;
	private int code_Type;
	public int getNoimmatriculation() {
		return noimmatriculation;
	}
	


	public Voiture( String marque, String model) {
		super();
		
		this.marque = marque;
		this.model = model;
	}



	public void setNoimmatriculation(int noimmatriculation) {
		this.noimmatriculation = noimmatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getCumul_reparation() {
		return cumul_reparation;
	}
	public void setCumul_reparation(String cumul_reparation) {
		this.cumul_reparation = cumul_reparation;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public int getCode_Type() {
		return code_Type;
	}
	public void setCode_Type(int code_Type) {
		this.code_Type = code_Type;
	}
	@Override
	public String toString() {
		return "Voiture [noimmatriculation=" + noimmatriculation + ", marque="
				+ marque + ", model=" + model + ", couleur=" + couleur
				+ ", cumul_reparation=" + cumul_reparation + ", disponible="
				+ disponible + ", code_Type=" + code_Type + "]";
	}
	
}
