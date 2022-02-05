package basicprogramming;
import java.util.Scanner;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
	    System.out.print("Factors of " + number + " are: ");
	    for (int i = 1; i <= number; ++i) {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }

	}

}
