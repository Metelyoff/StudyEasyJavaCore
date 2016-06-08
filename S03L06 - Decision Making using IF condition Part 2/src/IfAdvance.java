

public class IfAdvance {

	public static void main(String[] args) {
		
		int age = 25; 
		String gender = "Male";
		
		
		if(age >= 18 )		
		{
				if(gender == "Female")
				{
					System.out.println("You have legal right to get married");
				}else if( age >=21)
				{
					System.out.println("You have legal right to get married");
				}else
				{
					System.out.println("You do not have legal right to get married");
				}
				
		}else
		{
			System.out.println("You do not have legal right to get married");
		}
		
	}

}
