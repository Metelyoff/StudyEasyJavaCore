import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		
		String location = "test.txt";
		File textFile = new File(location);
        
        try(BufferedWriter br = new BufferedWriter(new FileWriter(textFile, true))){
        	
        	br.newLine();
        	br.write("One");
        	br.newLine();
        	br.write("Two");
		
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
