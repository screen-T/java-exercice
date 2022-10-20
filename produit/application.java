package tp2;

public class application {

	public static void main(String[] args) {
		Produit p1=new Produit("PC","Informatique",1350) ;
		Produit p2=new Produit("Frigo","Electromenager",1102,20) ;
		Produit p3=new Produit("Poupee","Jouet",45,60) ;
		Produit p4=new Produit(p1) ;
		Produit p5=new Produit(p2) ;
		Produit p6=new Produit(p5) ;
		p4.setPourcentagePromotion(20);
		p5.setPrix(28);
		System.out.println(p1.afficher()); 
		System.out.println(p2.afficher()); 
		System.out.println(p3.afficher());
		System.out.println(p5.afficher());
		System.out.println("le produit p4 est "+p4.getDesignation()+" prix "+p4.getPrix()+" promo de "+p4.getPourcentagePromotion()+"%");
		if (p1.getCategorie().equals(p4.getCategorie()))
		{
			 p6=p1.compareProduit(p4);
			 System.out.println("le produit moins cher "+p5.afficher());
		}
		else 
		{
			System.out.println("un eruer de comparaison ");
		}
	}

}
