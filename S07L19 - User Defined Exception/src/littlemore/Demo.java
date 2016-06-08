package littlemore;
		
class NewException extends Exception{
	
	NewException(){
		super();
		//System.out.println("New Exception");
	}
	NewException(String s){
		super(s);
	}
}

class App {
	
	int zero = 0;
	String name = null;
	void test() throws NullPointerException, ArithmeticException,ClassNotFoundException, NewException{
	
		/*
		 * NullPointerException
		 * ArithmeticException
		 * ArrayIndexOutOfBoundsException
		 */
		/*
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[5]);
		System.out.println(10/zero);
		System.out.println(name.length());
		*/
		throw new NewException("New Exception passed");
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		App ap = new App();
		try {
			ap.test();
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All is well");
	
		
	}

}
