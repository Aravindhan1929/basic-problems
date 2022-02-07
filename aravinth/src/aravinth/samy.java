package aravinth;


public class samy {

	public static void main(String[] args) {
		prblm obj=new prblm();
		obj.prblm1(1);
		obj.problem(2);

	}

}
class prbl{
	public void problem(int i) {
		if(i!=10) {
			System.out.println(i);
			problem(i+1);
		}
	}
}
class prblm extends prbl{
	public void prblm1(int j) {
		System.out.println(j);
	}
}
