package basicprogramming;
import java.util.Scanner;
public class largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int firstnumber=input.nextInt();
		int secondnumber=input.nextInt();
		int thirdnumber=input.nextInt();
		if(firstnumber>=secondnumber && firstnumber>=thirdnumber) {
				System.out.println("the largestnumber is "+ firstnumber);
		}
		else if(secondnumber>=firstnumber && secondnumber>=thirdnumber) {
				System.out.println("the largest number is "+ secondnumber);
		}
		else {
			System.out.println("the largest number is "+ thirdnumber);
		}

	}

}
