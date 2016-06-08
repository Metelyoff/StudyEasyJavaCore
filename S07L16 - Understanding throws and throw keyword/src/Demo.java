class App {
	
	int zero = 0;
	void test() throws Exception{
		
		throw new Exception();
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		try {
			d1.test2();
		} catch (Exception e) {
			System.out.println("Divide by zero");
		}
		
		
		System.out.println("All is okay!!");
	}
	void test2() throws Exception{
		App ap = new App();
		
		   ap.test();
		
	}

}
