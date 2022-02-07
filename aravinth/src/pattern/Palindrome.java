package pattern;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int temp=0;
		int duplicate=number;
		while(number>0) {
			int digit=number%10;
			temp=temp*10+digit;
			number=number/10;
		}
		if(temp==duplicate) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}

	}

}
