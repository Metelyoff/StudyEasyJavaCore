
public class JavaLiterals {

	public static void main(String[] args) {
		int decimal = 100;
		int octal = 0144;
		int hexa =  0X6F;
		int binary = 0B10011101;
		
		System.out.println(decimal);
		System.out.println(Integer.toOctalString(octal));
		System.out.println(hexa);
		System.out.println(binary);
		
		float x = 2514.22514f;
		double y = 4.521d;

       System.out.println('\\');
       System.out.println("line 1 \n line 2");
       
       System.out.println("This is a " + "two-line string");
       
       boolean chosen = true;
       
       System.out.println(chosen);
       
       //y = null;
	}

}
