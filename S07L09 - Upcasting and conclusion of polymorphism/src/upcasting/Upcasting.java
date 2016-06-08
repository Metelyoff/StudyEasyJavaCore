package upcasting;

class Bike{  
	  void run(){System.out.println("running");}  
	}  
	class Upcasting extends Bike{  
	  void run1(){System.out.println("runs fast");}  
	  
	  public static void main(String args[]){  
	    Bike b = new Upcasting();  //upcasting
	    b.run();  
	  }  
	} 
