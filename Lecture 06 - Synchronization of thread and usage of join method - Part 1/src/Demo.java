
class Common{
	private int counter = 0;
	
	synchronized void incrementCounter(){
		for(int i = 0; i < 10000 ; i++)
		{
			counter++;
		}
	}
	int getCounter(){
		return counter;
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Common c1 = new Common();
		
		Thread t1 = new Thread(){
			public void run() {
			    c1.incrementCounter();	
			}
			
		};
		Thread t2 = new Thread(){
			public void run() {
			    c1.incrementCounter();	
			}
			
		};
		
       t1.start();
       t2.start();
      
	
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
       
       System.out.println(c1.getCounter());
       
	}

}
