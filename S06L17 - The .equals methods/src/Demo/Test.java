package Demo;

class Info{
	private int id;
	String name;
	
	Info(int id, String name){
		this.id = id;
		this.name = name;
		}
  public void display(){
	  System.out.println("ID and Name :"+ id + name);
  }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Info other = (Info) obj;
	if (id != other.id)
		return false;
	return true;
}
	
}
public class Test {

	public static void main(String[] args) {
		
  
		Info Demo1 = new Info(1,"John");
		Info Demo2 = new Info(5,"John");
		System.out.println(Demo1.equals(Demo2));
		
	}

}
