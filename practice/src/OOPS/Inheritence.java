package OOPS;
public class Inheritence {
	public static void main(String[] args) {
	    child obj=new child("Manoj");
		obj.bite();
		obj.eat();
		obj.Solution("Manoj");
		System.out.println(obj.name);
		
	}
}
class Inherit {//parent class,super class
	String name="Manoj";
	public Inherit(String a) {
		name=a;
	}
	public Inherit() {	
	}
    static void eat() {
		System.out.println("parent eating");
	}
	void Solution(String name) {
		this.name=name;
		System.out.println(name);
	}
}
class child extends Inherit{//child class,sub class
	String name="Aravinth";
	public child(String b) {
		super(b);
		String s=super.name;
		System.out.println(name+"child");
		System.out.println(s);
		System.out.println("running");
	}
	void Solution(String name) {
		this.name=name;
		System.out.println(name);
	}
	void bite() {
		super.eat();
		System.out.println("it will bite");
	}
	static void eat() {
		System.out.println("child over riding");
	}
}
            

