package demo;


class Show{
	private String name;
	private int id;
	
	public void setData(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String getData() {
		
		String id = String.format("%-10d", this.id); 
	
		StringBuilder sb1 = new StringBuilder();
		sb1.append(id).append(" & ").append(name);
		return sb1.toString();
	
}
}

public class Demo {

	public static void main(String[] args) {
          
		Show d = new Show();
		d.setData("John", 25);
        System.out.println("ID & Name : "+d.getData());
	}

}