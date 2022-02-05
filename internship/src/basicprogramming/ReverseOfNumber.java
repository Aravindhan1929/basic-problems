package basicprogramming;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int temp=0;
		while(number>0) {
			int digit=number%10;
			temp=temp*10+digit;
			number=number/10;
		}
		System.out.println(temp);

	}

}
