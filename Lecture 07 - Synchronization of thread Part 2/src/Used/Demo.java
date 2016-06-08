package Used;

class Common{
 
	synchronized void counter(int unit){
		for(int i = 0; i <= 5; i++)
		{
			System.out.println(unit * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class incrementer1 extends Thread{
	Common c;
	incrementer1(Common c){
		this.c = c;
	}
    
	public void run() {

		c.counter(5);
	}
	
}
class incrementer2 extends Thread{
	Common c;
	incrementer2(Common c){
		this.c = c;
	}
    
	public void run() {

		c.counter(2);
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
		Common demo = new Common();
		incrementer1 t1 = new incrementer1(demo);
		incrementer2 t2 = new incrementer2(demo);
		t1.start();
		t2.start();
		
	}

}
