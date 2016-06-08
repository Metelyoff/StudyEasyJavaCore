package interfaces;

interface printable{  
  void print();
  void print1(int x);  
  static final int zero =0;
}  
  
class Interfaces implements printable
{
	public static void main(String args[])
	{  
		Interfaces obj = new Interfaces();  
		obj.print();  
	} 
	public void print()
	{
		System.out.println("Hello World");
	}
	public void print1(int x)
	{
		System.out.println("Hello World");
	}
} 