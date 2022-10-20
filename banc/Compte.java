package tp3;

public class Compte {
	private int numCompte=1000 ;
	private int nbCompte=0 ;
	static int count=1000 ; 
	static int count2=0 ; 
	
	private double solde ;
	// getters and setters 
	public int getnumCompte()
	{
		return this.numCompte ;
	}
	public int getNbCompte() {
		return nbCompte;
	}
	public void setNbCompte(int nbCompte) {
		this.nbCompte = nbCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	//constracteur
	public Compte (double solde)
	{
		this.solde=solde ; 
		this.numCompte=count;
		this.nbCompte=count2 ; 
		count++ ;
		count2++ ;
		
	}
	//solde ++
	public void verser (double x)
	{
		this.solde=this.solde+x ;
	}
	//rtire l'argent 
	public boolean retire (double x)
	{
		if (x<=this.solde)
		{
			this.solde=this.solde-x  ; 
			return true  ;
		}
		else 
		{
			return false ;
		}
	}
	//affiche
	public String affiche()
	{
		return "Compte num ="+this.numCompte+" .Solde="+this.solde ;
	}
	
	

}
