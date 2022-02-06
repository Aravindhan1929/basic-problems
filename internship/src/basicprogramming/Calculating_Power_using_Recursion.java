package basicprogramming;
import java.util.Scanner;
public class Calculating_Power_using_Recursion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int base = input.nextInt();
		int powerRaised = input.nextInt();
	    int result = power(base, powerRaised);
	    System.out.println(base + "^" + powerRaised + "=" + result);
	}
	public static int power(int base, int powerRaised) {
	    if (powerRaised != 0) {
	      return (base * power(base, powerRaised - 1));
	    }
	    else {
	      return 1;
	    }
	  }

}
