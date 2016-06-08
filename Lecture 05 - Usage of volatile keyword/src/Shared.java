import java.util.Scanner;

class Common extends Thread {
  volatile private int counter = 1; 
	public void run() {

		while (true) {
             System.out.println("Hello World");
             if(counter == 0)
             {
            	 break;
             }
             try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
  public void resetCounter()
  {
	  counter = 0;
  }
}

public class Shared {
    
	public static void main(String[] args) {
		 
         Common c1 = new Common();
         c1.start();
         
         System.out.println("Press Enter to stop..");
         Scanner s1 = new Scanner(System.in);
         s1.nextLine();
         
         c1.resetCounter();
	}

}
