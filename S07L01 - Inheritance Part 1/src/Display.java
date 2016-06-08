
public class Display{
   public static void main(String[] args) {
		
	   /*Human whoAmI = new Human();
	   whoAmI.whoAmI();
	   Russian rus = new Russian();
	   rus.iAmFrom();
	   rus.whoAmI();
	   American amr = new American();
	   amr.whoAmI();
	   amr.iAmFrom();
	   Asian asn = new Asian();
	   asn.whoAmI();
	   asn.iAmFrom(); */
	   Indian ind = new Indian();
	   ind.whoAmI();
	   ind.iAmFrom();
	   System.out.println(ind.a);
	   
	}
}
class Human {	
	int a =25;
	void whoAmI(){
	 	System.out.println("I am a human");
	}
}
class American extends Human{
	void iAmFrom(){
		System.out.println("I am from America");
	}
}
class Russian extends Human{
	void iAmFrom(){
		System.out.println("I am from Russia");
	}
	
}
class Asian extends Human{
	int a  = 11; 
	void iAmFrom(){
		System.out.println("I am from Asia");
	}
}
class Indian extends Asian{
	//int a  = 10; 
	void iAmFrom(){
		System.out.println("I am from India");
	}
}
