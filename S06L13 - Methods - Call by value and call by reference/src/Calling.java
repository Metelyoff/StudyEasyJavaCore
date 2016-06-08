
public class Calling {

	public static void main(String[] args) {
		
		int[] x = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		System.out.println("Values before call : "+ (x[0]) +" "+ (x[1]) +" "+ (x[2]));
	    Calling c = new Calling();
	    c.change(x);
	    System.out.println("Values after call : "+ (x[0]) +" "+ (x[1]) +" "+ (x[2]));
	    
		
	}
	 void change(int[] x)
	 {
		 x[0] = 100;
	     x[1] = 200;
		 x[2] = 300;
			 
	 }

}
