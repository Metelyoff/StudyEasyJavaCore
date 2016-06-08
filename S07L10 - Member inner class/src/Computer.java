
public class Computer {

	private int cost ;
	public Computer(int cost) {
		
		this.cost = cost;
	}
	public void Display()
	{
		System.out.println("Cost : "+ cost);
		Desktop ds = new Desktop();
		ds.info();
	}
	
	class Desktop{
		
		String type = "Desktop";
		String Brand = "HP";
		
		void info()
		{
			System.out.println("Type : " +type);
			System.out.println("Brand : " +Brand);
		}
		
		
	}
	
}
