package basicprogramming;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
