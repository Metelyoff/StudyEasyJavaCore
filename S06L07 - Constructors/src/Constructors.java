
public class Constructors {

	public static void main(String[] args) {
		Bank user1 = new Bank("John",1234,"Savings");
		user1.getDetails();

	}

}
class Bank{
	int accountNo;
	String name,type;
	
	Bank(String name, int accountNo, String type)
	{
		this.name = name;
		this.accountNo = accountNo;
		this.type = type;
	}
	Bank()
	{
		
	}
	void getDetails()
	{	
		if( accountNo == 0 || name == null || type == null){
			System.out.println("Users bank details not found, please set details first");
		}else{
			System.out.println("Name :"+name);
			System.out.println("Account No  :"+accountNo);
			System.out.println("Type :"+type);
			
		}
	}
	
}
