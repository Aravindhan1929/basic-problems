package basicprogramming;
import java.util.Scanner;
public class swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int firstnumber=input.nextInt();
		int secondnumber=input.nextInt();
		int temp=secondnumber;
		secondnumber=firstnumber;
		firstnumber=temp;
		System.out.println(firstnumber);
		System.out.println(secondnumber);

	}

}
