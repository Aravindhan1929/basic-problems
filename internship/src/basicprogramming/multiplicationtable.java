package basicprogramming;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" x "+i+" = "+number*i);
		}

	}

}
