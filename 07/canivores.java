package tp7;

public class canivores extends Animal {
	private int qteViande  ;
	public canivores(String n , int k, int c )
	{
		super(n , k ) ;
		if ((k<3)&&(c>3))
		{		
			this.qteViande=3 ;
		}
		else if ((k<3)&&(c<3))
		{
			this.qteViande=c; 	
		}
		else if ((k<12)&&(c>3)&&(c<=5))
		{
			this.qteViande=c; 	
		}
		else if ((k<12)&&(c>3)&&(c>5))
		{
			this.qteViande=5; 	
		}
		else if ((k>=12)&&(c>5)&&(c<=7))
		{
			this.qteViande=c; 	
		}
		else if ((k>=12)&&(c>5)&&(c>=7))
		{
			this.qteViande=7; 	
		}
	}
	public int getQteMyene() 
	{
		return this.qteViande ; 
	}
	public int calculerCout (int j)  
	{
		return this.qteViande*j ; 
	}
	@Override
	public String toString() {
		return super.toString()+" qteViande=" + qteViande ;
	} 
}
