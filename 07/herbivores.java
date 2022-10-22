package tp7;

public class herbivores extends Animal {
	

	private int qteHerbre  ;
	
	public herbivores(String n , int k, int c )
	{
		super(n , k ) ;
		
		if ((k<4)&&(c>1)&&(c<=3))
		{
			this.qteHerbre=c; 	
		}
		else if ((k<4)&&(c>3))
		{
			this.qteHerbre=3; 	
		}
		else if ((k>=4)&&(c<3)&&(c<=5))
		{
			this.qteHerbre=c; 	
		}
		else 
		{
			this.qteHerbre=5; 	
		}
	}
	
	
	public int getQteMyene() 
	{
		return this.qteHerbre ; 
	}
	public int calculerCout (int j)  
	{
		return this.qteHerbre*j ; 
	}


	@Override
	public String toString() {
		
		return super.toString() +" qteHerbre=" + qteHerbre ;
	}
}
