
public class Demo {

	public static void main(String[] args) {
		Computer c1 = new Computer(5000);
		c1.Display();
		
		Computer.Desktop d1 = c1.new Desktop();
		d1.info();

	}

}
