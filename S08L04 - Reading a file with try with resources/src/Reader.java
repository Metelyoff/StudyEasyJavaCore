import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		
		String location = "test.txt";
		File textFile = new File(location);
        
        try(BufferedReader br = new BufferedReader(new FileReader(textFile))){
        	
        	String temp;
        	while((temp = br.readLine()) != null){
        		System.out.println(temp);
        	}
        	
        } catch (FileNotFoundException e) {
			
			System.out.println("File not found " + textFile.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + textFile.toString());
		}
		
	}

}
