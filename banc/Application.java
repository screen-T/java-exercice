package tp3;

public class Application {

	public static void main(String[] args)
	{ 
		Compte c1= new Compte(120.5) ;
		Compte c2= new Compte(1850.5) ;
		System.out.println(c1.affiche()) ;
		System.out.println(c2.affiche()) ;
		c2.verser(200);
		System.out.println(c2.affiche()) ;
		if (c1.retire(200)==true)
		{
			System.out.println("réussit"+c1.affiche()) ;
		}
		else 
		{
			System.out.println("non votre max est "+c1.getSolde()) ; ;
		}
		
	    boolean teste ;  
		Compte c3= new Compte(70) ;
		Compte c4= new Compte(70) ;
		c3=OperationsBancaires.creeCompte(20) ;
		System.out.println(c3.affiche()) ;
		teste=OperationsBancaires.ajoutCompte(c3) ;
		if (teste==true)
		{
			System.out.println("succesfull aded") ;
		}
		else
		{
			System.out.println("failed aded") ;
			
		}
		c4=OperationsBancaires.creeCompte(50) ;
		System.out.println(c4.affiche()) ;
		teste=OperationsBancaires.ajoutCompte(c4) ;
		if (teste==true)
		{
			System.out.println("succesfull aded") ;
		}
		else
		{
			System.out.println("failed aded") ;
			
		}
		
		
	}
		
}
