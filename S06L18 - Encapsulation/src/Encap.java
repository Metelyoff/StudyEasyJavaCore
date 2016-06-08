class Demo{
	private String name;
	private int id;
	
	public void setData(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
 
	
}

public class Encap {

	public static void main(String[] args) {
          
		Demo d = new Demo();
		d.setData("John", 25);
        System.out.println("Name :"+d.getName());
        System.out.println("ID :"+d.getId());
	}

}
