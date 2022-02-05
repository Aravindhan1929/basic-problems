package basicprogramming;
import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int base = input.nextInt();
		int exponent = input.nextInt();
	    long result = 1;
	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }
	    System.out.println("Answer = " + result);
	}
}
