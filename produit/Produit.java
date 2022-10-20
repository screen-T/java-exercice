package tp2;

public class Produit {
	private String designation ;
	private String categorie ; 
	private int prix ; 
	private int pourcentagePromotion ;
	//constructeur de 3 parametre
	public Produit  (String designation ,String categorie ,int prix  )
	{
		this.designation=designation ; 
		this.categorie=categorie ; 
		this.prix=prix ;
		this.pourcentagePromotion=0 ;
	}
	//constructeur de 4 parametre 
	public Produit  (String designation ,String categorie ,int prix, int pourcentagePromotion  )
	{
		this.designation=designation ; 
		this.categorie=categorie ; 
		this.prix=prix ;
		this.pourcentagePromotion=pourcentagePromotion;
	}
	//constreucteur de copie 
	public Produit ( Produit p1)
	{
		this.designation=p1.designation ;
		this.categorie=p1.categorie ;
		this.pourcentagePromotion=p1.pourcentagePromotion ;
		this.prix=p1.prix ;
	}
	// getters and setters 
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getPourcentagePromotion() {
		return pourcentagePromotion;
	}
	public void setPourcentagePromotion(int pourcentagePromotion) {
		this.pourcentagePromotion = pourcentagePromotion;
	}
	//methode il est en promotion ou non
	public boolean isEnPromotion()
	{
		if (pourcentagePromotion>0 )
		{
			return true ;
		}
		else 
		{
			return false  ;
		}
		
	}
	//calculer le prix apres promo 
	private double calculerPrixPromotionnel()
	{
		double k ;
		k=((double)this.pourcentagePromotion/100) ; 
		return prix-(k*this.prix) ;
	}
	//comparaison de 2 produit 
	public Produit  compareProduit(Produit p1)
	{
		if (p1.calculerPrixPromotionnel()>this.calculerPrixPromotionnel())
		{
			return this ;
		}
		else 
		{
			return p1 ;
		}
	}
	//les message de promo
	private String slonganPromo()
	{
		String ch ;
		if (this.pourcentagePromotion==0)
		{
			return null ;
		}		
		else if (this.categorie.equals("Informatique"))
		{
			if (this.pourcentagePromotion<20)
			{
				ch="Promotion intéressante !" ;
				return ch ;
			}
			else
			{
				return "Promotion imbattable !" ;
			}
		}
		else if (this.categorie.equals("Electromenager"))
		{
			if (this.pourcentagePromotion<=30)
			{
				return "Bonne promo !" ;
			}
			else
			{
				return "Promotion incontournable !" ;
			}
		}
		else if (this.categorie.equals("Jouet"))
		{
			if (this.pourcentagePromotion<=30)
			{
				return "Bonne promo !" ;
			}
			else
			{
				return "Promotion incontournable !"  ;
			}
		}
		else if (this.pourcentagePromotion>0)
		{
			return "A ne pas rater !" ;
		}
		else 
		{
			return null  ; 
		}
			
	}
	//affichage dans l'application
	public String afficher()
	{
		String ch ; 
		if (this.isEnPromotion()==true)
		{
			ch= this.slonganPromo()+" "+this.designation+"="+this.calculerPrixPromotionnel()+" au lieu de "+this.prix  ;
			return ch ;
		}
		else
		{
			ch=this.slonganPromo()+" prix ="+this.prix ; 
			return ch ; 
		}
	}
}
