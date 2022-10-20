package tp5_heritage;

public class Application {

	public static void main(String[] args) {
		Voiture v1=new Voiture ("green","mrc",3) ;
		Voiture v2=new Voiture (4) ;
		Voiture v3=new Voiture (v1) ;
		Voiture v4=new Voiture ("noire","bmw",2) ;
		System.out.println(v1.compareVoiture(v4, v4)) ;
		System.out.println(v3.toString()) ;
		System.out.println(v2.toString()) ;
		
	}

}
