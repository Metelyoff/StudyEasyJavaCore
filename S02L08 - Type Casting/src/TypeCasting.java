public class TypeCasting
{
    public static void main(String[] args)
    {
    	int x = 10;	
        long y = x;	// Implicit Casting
        double z = y; // Implicit Casting
        long j=1251415363;
        float k = j; // Implicit Casting
        System.out.println("Int value of x "+x);
        System.out.println("Long value of y "+y);
        System.out.println("double value of z "+z);
        System.out.println("float value of k "+k);
        //------------------------------------------------//
        float pi2 = (float)3.14; //explicit type casting required  
        double x2 = 10.04;  
        long y2 = (long)x2;  //explicit type casting required  
        int z2 = (int)x2;	//explicit type casting required  
        
        System.out.println("pi2 = "+pi2);
        System.out.println("Double value of x2 "+x2);
        System.out.println("Long value of y2 "+y2);
        System.out.println("Int value of z2 "+z2);
        
        
    }
 }

