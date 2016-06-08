
public abstract class Human {

	void think(){
		System.out.println("Please wait, thinking.....");
	}
	
	abstract void looks();
	void man(){
		System.out.println("Hey, i am a man.");
		think();
		looks();
	}
	void women(){
		System.out.println("Hey, i am a Women.");
		think();
		looks();
	}
}
