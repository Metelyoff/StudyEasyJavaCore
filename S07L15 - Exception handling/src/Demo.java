class App{
	
	int zero = 0;
	int test(){
		return 10/zero;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		App ap = new App();
		try{
		   ap.test();
		}
		catch(Exception e){
		
			System.out.println("Divide by zero");
			//e.printStackTrace();
		}
		System.out.println("All is okay!!");
	}

}
