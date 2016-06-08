
public class Usage {
	public static void main(String[] args){
		StaticMembers.test();
	}
	
}
class StaticMembers
{
	int nonStaticVariable = 5;
	final static int staticVariable = 20;
	static void test()
	{
		//System.out.println(nonStaticVariable);
		System.out.println(staticVariable);
	 	
	}
	
}