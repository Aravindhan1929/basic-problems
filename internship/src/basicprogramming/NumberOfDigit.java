package basicprogramming;
import java.util.Scanner;
public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int temp=0;
		while(number>0) {
			number=number/10;
			temp++;
		}
		System.out.println(temp);
	}

}
