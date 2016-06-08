
class TryIt implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closed!");
		
	}
	
}


public class Demo {

	public static void main(String[] args) {
		
		try(TryIt Ty = new TryIt()){
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
