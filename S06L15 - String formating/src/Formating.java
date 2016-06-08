
public class Formating {

	public static void main(String[] args) {
		
		//% {flags} {width} {.precision} conversion-character
		/*
		 * - : left-justify ( default is to right-justify )
		   + : output a plus ( + ) or minus ( - ) sign for a numerical value
           0 : forces numerical values to be zero-padded ( default is blank padding )
           , : comma grouping separator (for numbers > 1000)
             : space will display a minus sign if the number is negative or a space if it is positive
		 */
		
		System.out.printf("%,d", 1000000000);
		
		/*String Str = "test string";
		
	    for(int i = 5; i < 15; i++)
	    {
	    	System.out.printf("%-2d: %s \n", i,Str);
	    }
		*/
		

	}

}
