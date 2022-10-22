
package tp7;

public abstract class Animal {
	private String nom  ; 
	private int age ; 
	
	public Animal (String a ,int m )
	{
		this.age=m ;
		this.nom=a ;		
	}
	public int getage()
	{
		return this.age ;
	}
	public abstract int getQteMyene() ;
	public abstract int calculerCout (int j)  ;
	@Override
	public String toString() {
		return "nom=" + nom + ", age=" + age ;
	}
	
	
}
