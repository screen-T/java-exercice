package tp5_heritage;

public class Voiture extends Vehicule{
	private int nbPortes ; 
	public Voiture (int n )
	{
		this.nbPortes=n ; 
	}
	public Voiture (String couleur  , String marque , int nb )
	{
		super(couleur , marque)  ; 
		this.nbPortes=nb ;		
	}
	public Voiture (Voiture v1)
	{
		super.setCouleur(v1.getCouleur());
		super.setMarque(v1.getMarque());
		nbPortes=v1.nbPortes ;
	}
	public int getNbPortes() {
		return nbPortes;
	}
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	
	public String compareVoiture(Voiture v1, Voiture v2)
	{
		if (v1.getCouleur().equals(v2.getCouleur()) & (v1.getMarque()==v2.getMarque() ) & (v1.nbPortes==v2.nbPortes))
		{
			return "True" ;
		}
		else 
		{
			return "false" ;
		}
	}
	@Override
	public String toString() {
		return "Voiture [nbPortes=" + nbPortes +super.toString()+ "]";
	}
	
}
