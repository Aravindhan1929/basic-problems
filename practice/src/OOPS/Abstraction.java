package OOPS;

public class Abstraction {

	public static void main(String[] args) {
//		BMW obj=new BMW();
//		obj.enginedesign();
//		obj.carvault();
		Audi obj1=new Audi();
		obj1.enginedesign();
		obj1.carvault();
		obj1.wheels();
	}
}
abstract class car{ 
	car(){
		System.out.println("constructor");
	}
	abstract void enginedesign();
    abstract void carvault(); 
    public void wheels() {
   	   System.out.println("It has four wheels");
    }
}  
//class BMW extends car{ 
	//@Override
//	void enginedesign() {
//		System.out.println("It is BMW engineedesign");
//	}
//	@Override
//    void carvault() {
//    	System.out.println("It is BMW Car vault");
//	}
//}  
class Audi extends car{
	@Override
	void enginedesign() {
		System.out.println("It is Audi's engineedesign");
	}
	@Override
    void carvault() {
    	System.out.println("It is Audi's Car vault");
	}
}
 
