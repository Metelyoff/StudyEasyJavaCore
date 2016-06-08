class Car{
	void run(){
		System.out.println("Car runs...");
	}
	
}

interface Jet{
	void fly();
}
public class Demo {

	public static void main(String[] args) {
		
        Car car = new Car(){

			@Override
			void run() {
				System.out.println("Run fast...");
			}
        	
        };
        car.run();
      
        Jet plane = new Jet(){

			
			public void fly() {
			
				System.out.println("Flying Fast...");
			}
        	
        }; 
        plane.fly();
	}

}
