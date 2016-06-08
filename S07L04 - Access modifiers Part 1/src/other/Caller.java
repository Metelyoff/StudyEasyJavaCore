package other;

import yetAnother.AccessModifier;

public class Caller extends AccessModifier{

	public static void main(String[] args) 
	{
	    Caller	obj = new Caller();
	    
	    System.out.println(obj.a);
	    //obj.methodA();
	    //obj.methodB();
	    obj.methodC();
	    //obj.methodD();	
	}

}