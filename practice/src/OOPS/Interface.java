package OOPS;

public class Interface {

	public static void main(String[] args) {
		Tata obj=new Tata();                           //In real scenario, object is provided by method  
		obj.enginedesign();
		System.exit(-1);
		obj.carvault();
	}
}
interface Bus{                                                   //in this it implements 100% abstraction
    void enginedesign();
    void carvault();
    default void method(){
    	System.out.println("Aravinth");
    }
    static void method1() {
    	System.out.println("Aravinth");
    }
}  

class Tata implements Bus{ 
	@Override
	public void enginedesign() {
		System.out.println("It is Tata engineedesign");
	}
	@Override
    public void carvault() {
   	System.out.println("It is Tata Car vault");
	}
	@Override
	public void method(){
    	System.out.println("Aravinth");
    }
	static void method1() {
    	System.out.println("Aravinth");
    }
}  
class Volvo implements Bus{
	@Override
	public void enginedesign() {
		System.out.println("It is Volvo engineedesign");
	}
	@Override
   public void carvault() {
   	System.out.println("It is Volvo Car vault");
	}
}

