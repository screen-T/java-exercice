package tp3;

public class OperationsBancaires 
{
	static Compte[] tabCompte=new Compte[100] ;
	static int nb ; 
	static int len=0 ; 
	static final int solde_min=10 ;
	
	//acc
	public static int getnb()
	{
		return nb ; 
	}
	public static Compte creeCompte(double m)
	{
		 
		if (m>solde_min)
		{
			 Compte c1=new Compte(m) ;
			 return c1 ; 
		}
		else
		{
			System.out.println("le compte ne peut pas etre crier") ;
			return null ;
		}
		
		
	}
	public static boolean ajoutCompte(Compte c1)
	{
		int i  ;
		int f=0 ; 
		int x= c1.getnumCompte(); 
		if (len==0)
		{
			tabCompte[len+1]=c1 ;
			return true ;
		}
		else 
		{
			for (i=0; i<len;i++)
			{
				if (x==tabCompte[i].getnumCompte())
				{
					f++; 
				}	
			}
			if (f>0)
			{
				return false ; 
			}
			else 
			{
				tabCompte[len]=c1 ;
				len=len+1 ; 
				return true  ; 
			}	
		}
	}
	static int  positionCompte(int num )
	{
		int i , k=-1 ; 
		
		for (i=0;i<len; i++)
		{
			if (tabCompte[i].getnumCompte()==num)
			{
				k=i ; 
			}
		}
		return k ; 	
	}
	static void verserCompte(int num , double ment)
	{
		if (OperationsBancaires.positionCompte(num)!=-1)
		{
			tabCompte[OperationsBancaires.positionCompte(num)].verser(ment);
		}	
	}

	static void retirerCompte(int num , double m)
	{
		tabCompte[OperationsBancaires.positionCompte(num)].retire(m);
	}
	
	static void supprimerCompte(Compte p1)
	{
		
		int i ;
		int k  ; 
		k=OperationsBancaires.positionCompte(p1.getnumCompte()) ;
		
		if (k!=-1)
		{
			for (i=k;i<len-1;i++)
			{
				tabCompte[i]=tabCompte[i+1] ; 
				
			}
		}
		len=len-1 ; 
		
		
		
	}
	
	static void afficherCompte()
	{
		int i ; 
		for (i=0  ; i<len ; i++)
		{
			System.out.println("le numero est "+tabCompte[i].getNbCompte()+" le solde est "+tabCompte[i].getSolde());
		}
	}
	static void afficherCompteSolde(int m)
	{
		int i ; 
		for (i=0  ; i<len ; i++)
		{
			if(tabCompte[i].getSolde()>m)
			{
				System.out.println("le numero est "+tabCompte[i].getNbCompte()+" le solde est "+tabCompte[i].getSolde());
			}
			
		}
	}
	
	
	
	
}
