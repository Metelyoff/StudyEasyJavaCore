
public class Demo {
	/*
	public static final int COREJAVA = 1;
	public static final int COLLECTIONS = 2;
	public static final int GENERICS= 3;
	public static final int DESIGNPATTERN = 4;
	public static final int MUILTITHREADING = 5;
    */
	public static void main(String[] args) {
		Java learning = Java.DESIGNPATTERN;
		
		switch(learning){
		case COLLECTIONS:
			System.out.println("Step 2 : Learning Collections framework");
			break;
		case COREJAVA:
			System.out.println("Step 1 : learning Core Java");
			break;
		case DESIGNPATTERN:
			System.out.println("Step 4 : Learning Design Pattern");
			break;
		case GENERICS:
			System.out.println("Step 3 : Learning Generics ");
			break;
		case MUILTITHREADING:
			System.out.println("Step 5 : Learning MuiltThreading");
			break;
		default:
			System.out.println("All done!!");
			break;		
		}		
	}

}
