package banks;

import DefaultOperations.DefaultOperations;

public class BankXYZ extends DefaultOperations {
	public void deposit(int amount){
		System.out.println("User has deposited "+amount+ "INR");
		bal = bal + amount;
	}
	public void withdraw(int amount){
		System.out.println("User has withdrawn "+amount+"INR");
		bal = bal - amount;
	}
	public void details(String Country ){
		if(Country == "India")
		{
			System.out.println("TimeZone : IST");
			System.out.println("Bank currency : INR");
			System.out.println("Balance of user :"+bal);
	    }else
	    	System.out.println("Error occured");
   }
   public void test()
   {
	   //deposit(10);
	   super.deposit(25);
   }

	
}