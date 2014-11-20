package fr.treeptik.pojo;

public class Type_Voiture {

	private int code_Type;
	private String description_Type;
	private int places;
	private float prix_Jour;
	public int getCode_Type() {
		return code_Type;
	}
	public void setCode_Type(int code_Type) {
		this.code_Type = code_Type;
	}
	public String getDescription_Type() {
		return description_Type;
	}
	public void setDescription_Type(String description_Type) {
		this.description_Type = description_Type;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public float getPrix_Jour() {
		return prix_Jour;
	}
	public void setPrix_Jour(float prix_Jour) {
		this.prix_Jour = prix_Jour;
	}
	
}
