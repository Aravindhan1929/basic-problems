package basicprogramming;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1=input.nextInt();
		int number2=input.nextInt();
	    int lcm = (number1 > number2) ? number1 : number2;
	    while(true) {
	      if( lcm % number1 == 0 && lcm % number2 == 0 ) {
	        System.out.printf("The LCM of %d and %d is %d.", number1, number2, lcm);
	        break;
	      }
	      ++lcm;
	    }

	}

}
