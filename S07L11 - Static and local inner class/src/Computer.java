
public class Computer {

	private int cost ;
	public Computer(int cost) {
		
		this.cost = cost;
	}
	public void Display()
	{
		class Discount{
			int percent = 10;
			void discountedCost()
			{
				int actualCost = (cost/100) *(100 - percent);
		        System.out.println("Cost : "+actualCost);		
			}
		}
        Discount dc = new Discount();
        dc.discountedCost();
        Laptop lp = new Laptop();
        lp.info();
	}
	static class Laptop{
		String type = "Laptop";
		String Brand = "Lenovo";
		
		void info()
		{	
			System.out.println("Type : " +type);
			System.out.println("Brand : " +Brand);
		}
		
	}	
}
	

