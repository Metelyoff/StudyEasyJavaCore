
public class Methods {

	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.setDetails("John", 26, "Saving", 20000);
		user1.getDetails();
	
	}
	

}
class Bank{
 
	private String name, acountType;
	private int age,bal;
	
	int setDetails (String name, int age, String acountType, int bal){
		this.name = name;
		this.age = age;
		this.acountType = acountType;
		this.bal = bal;
		
		return 1;
	}
	void getDetails(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Acount Type :"+acountType);
		System.out.println("Balance :"+bal);
	}
	
}