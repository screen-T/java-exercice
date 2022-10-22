package tp7;

public class Application {

	public static void main(String[] args) {
		
		Animal ah1 = new herbivores("ma3za",3,5) ;
		Animal ah2 = new herbivores("djeja",1,2) ;
		Animal ac1 = new canivores("dog",4,5) ;
		Animal ac2 = new canivores("cat",15,12) ;
		
		Ferme f1= new Ferme() ;
		f1.ajouterAnimal(ah1);
		f1.ajouterAnimal(ah2);
		f1.ajouterAnimal(ac1);
		f1.ajouterAnimal(ac2);
		f1.affiche();
		System.out.println("le nombre daanimeaux : "+f1.nbAnimauxAge(3)); 
		System.out.println("le animeau qui monge becoup : "+f1.plusGrandMangeur().toString() );
		System.out.println("le cout de nouriture : "+f1.coutNourriture(12, 3));
	

	}

}
