package basicprogramming;
import java.util.Scanner;
public class positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
		if(value>0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("negative number");
		}

	}

}
