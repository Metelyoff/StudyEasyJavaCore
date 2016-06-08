import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args) throws FileNotFoundException {

		String location = "new\\test.txt";

		File test = new File(location);

		Scanner scan = new Scanner(test);
		int no = scan.nextInt();
		scan.nextLine();
		
		for(int i = 1; i <=no ; i++)
		{
			System.out.println(scan.nextLine());
		}
		
		/*while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}*/
		scan.close();

	}

}
