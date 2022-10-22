package tp7;



public class Ferme {
	private Animal[] t = new Animal[100] ;
	static int n=0 ; 
	public void ajouterAnimal (Animal a)
	{
		this.t[n]=a ; 
		n++  ;
	}
	public int nbAnimauxAge(int age )
	{
		int k=0  ;
		for (int i=0 ; i<n ; i++)
		{
			if (t[i].getage()<age)
			{
				k++ ; 
			}
		}
		return k ; 
	}
	public int coutNourriture(int prixa , int prixv)
	{
		int s=0  ; 
		for (int i=0 ; i<n ; i++)
		{
			if (t[i] instanceof canivores)
			{
				s=s+t[i].calculerCout(prixv) ;
			}
			else
			{
				s=s+t[i].calculerCout(prixa) ;
			}
		}
		return s ; 
	}
	
	public Animal plusGrandMangeur ()
	{
		int x=0  ;
		int pos=0 ; 
		
		for (int i=0 ; i<n ; i++)
		{
			if (t[i].getQteMyene()>x)
			{
				x=t[i].getQteMyene() ;
				pos=i  ; 
			}
		}
		return t[pos] ;
	}
	
	public void affiche() 
	{
		int i ; 
		for (i=0 ; i<n ; i++)
		{
			System.out.println(t[i].toString());
		}
		
	}
	
	
	

}
