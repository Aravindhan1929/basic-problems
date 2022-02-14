package Practice_Problems;
import java.util.Scanner;

public class Swapping_digits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int theNumber = input.nextInt();
        int length = Integer.toString(theNumber).length();
        int firstDigit = theNumber / (int)Math.pow(10,length-1), lastDigit = theNumber % 10;
        theNumber /= 10;
        theNumber = ((theNumber * 10) + firstDigit);
        theNumber = (lastDigit * (int)Math.pow(10,length-1)) + (theNumber % (int)Math.pow(10,length-1));
        System.out.println("the reversed version is: " + theNumber);
	}

}
