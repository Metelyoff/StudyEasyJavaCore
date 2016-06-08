import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) {
		String location = "new/test.txt";
		
		File textFile = new File(location);
		try {
			String temp;
			FileReader reader = new FileReader(textFile);
		    BufferedReader br = new BufferedReader(reader);
		    while((temp = br.readLine()) != null){
		    	System.out.println(temp);
		    }
		    
		    br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found" + textFile.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

}
}
