
public class Overload {

	public static void main(String[] args) {
		OverloadedMethods obj = new OverloadedMethods();
		double result = obj.sum(25.5,10.5);
		System.out.println(result);
		System.out.println(obj.sum(10, 15));
		System.out.println(obj.sum(10, 1, 5));
	}
}
class OverloadedMethods{
	
	int sum(int a,int b)
	{
		
		return a+b;
	}
	int sum(int a,int b, int c)
	{
		
		return a+b+c;
	}
	double sum(double a,double b)
	{
		
		return a+b;
	}
}