
public class Methods {

	public static void main(String[] args) {
		
		Bank user1 = new Bank();
		user1.deposit(500);
		user1.deposit(300);
		System.out.println(user1.checkBal());
		
		Bank user2 = new Bank();
		user2.deposit(800);
		user2.deposit(250);
		System.out.println(user2.checkBal());
		

	}

}
class Bank{

	int bal = 0;
	void deposit(int amount){
	   bal = bal + amount;
	}
	
	int checkBal(){
	   return bal;	
	}
	
	
}