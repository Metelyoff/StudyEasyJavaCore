
interface Hello{  
void print();  
}  
  
interface World{  
void print();  
}
class Abc{}
  
class MultipleInhertance extends Abc implements Hello,World{  
  
public void print(){System.out.println("Hello");}  
public void world(){System.out.println("World");}  
  
public static void main(String args[]){  
	MultipleInhertance obj = new MultipleInhertance();  
    obj.print();  
    obj.world();  
 }  
} 