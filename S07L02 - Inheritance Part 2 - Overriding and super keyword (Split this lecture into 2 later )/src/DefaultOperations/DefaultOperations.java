package DefaultOperations;

public class DefaultOperations{
	private  String timeZone = "PST", currency = " Dollars";
	public int bal = 0;
	public void deposit(int amount){
		System.out.println("User has deposited "+amount+currency);
		bal = bal + amount;
	}
	
	public void withdraw(int amount){
		System.out.println("User has withdrawn "+amount+currency);
		bal = bal - amount;
	}
	final public void details(){
		System.out.println("TimeZone :"+ timeZone);
		System.out.println("Bank currency :" +currency);
		System.out.println("Balance of user :"+bal);
	}
	
}
 