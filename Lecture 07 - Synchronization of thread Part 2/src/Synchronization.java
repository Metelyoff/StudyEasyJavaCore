class Incrementer1 implements Runnable{
	Common c;
	Incrementer1(Common c){
		this.c = c;
	}
	public void run() {
		for(int i=0; i<10; i++){
			
			c.incrementCounter();
		}		
	}
		
}
class Incrementer2 implements Runnable{
	Common c;
	Incrementer2(Common c){
		this.c = c;
	}
	public void run() {
		for(int i=0; i<10; i++){
			
			c.incrementCounter();
		}		
	}
		
}
class Common{
	static private int counter = 1;
	public   void  incrementCounter(){
		
		System.out.println(counter++);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Synchronization{
	
	public static void main(String[] args){
		Common demo = new Common();
		Thread t1 = new Thread(new Incrementer1(demo));
		Thread t2 = new Thread(new Incrementer2(demo));
		t1.start();
		t2.start();
		
		
	}
	
}

