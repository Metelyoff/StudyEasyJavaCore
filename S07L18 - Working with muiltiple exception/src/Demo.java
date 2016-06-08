
		

class App {
	
	int zero = 0;
	String name = null;
	void test() throws NullPointerException, ArithmeticException,ArrayIndexOutOfBoundsException,ClassNotFoundException{
	
		/*
		 * NullPointerException
		 * ArithmeticException
		 * ArrayIndexOutOfBoundsException
		 */
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[5]);
		System.out.println(10/zero);
		System.out.println(name.length());
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		App ap = new App();
		try {
			ap.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		System.out.println("All is okay!!");
	}

}
