import java.util.Scanner;

public class IFBasics {

	public static void main(String[] args) {
		
		int currentYear = 2015, DOB;
		int age;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year of your date of birth");
		DOB = sc.nextInt();
		age = currentYear - DOB;
	    if(age >18)
	    {
	    	System.out.println("You are a adult");
	    }else
	    	System.out.println("You are minor");
         sc.close();
	}

}
