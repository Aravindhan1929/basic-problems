package basicprogramming;
import java.util.Scanner;
public class quotienttoremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int dividend = input.nextInt();
		int divisor = input.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println(quotient);
        System.out.println(remainder);

	}

}
