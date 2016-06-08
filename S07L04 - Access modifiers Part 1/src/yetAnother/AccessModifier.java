package yetAnother;

public class AccessModifier {
  protected int a = 10;
	void methodA()
	{
		System.out.println("Method A called");
	}
	public void methodB()
	{
		System.out.println("Method B called");
	}
	protected void methodC()
	{
		System.out.println("Method C called");
		methodD();
		
	}
	private void methodD()
	{
		System.out.println("Method D called");
	}
	
}