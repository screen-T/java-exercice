package tp5_heritage;

public class Vehicule {
	private String couleur , marque   ; 
	public Vehicule ()
	{
		this.couleur="rouge" ; 
		this.marque="ford" ; 
	}
	public Vehicule(String couleur, String marque) {
		this.couleur = couleur;
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	@Override
	public String toString() {
		return "Vehicule couleur= " + couleur + ", marque= " + marque + "";
	}
}
