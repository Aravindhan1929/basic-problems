package Practice_Problems;
import java.util.Scanner;
public class Prime_Factors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int theNumber = input.nextInt();
        System.out.println("Prime factors of " + theNumber);
        for(int i = 1; i < theNumber/2; i++) {
            if(theNumber % i == 0) {
                if(isPrime(i)) System.out.print(i + " ");
            }
        }
	}
	static boolean isPrime(int theNumber) {
        if(theNumber <= 1) return false;
        if(theNumber == 2) return true;
        for(int i = 2; i <= theNumber/2; i++) {
            if(theNumber % i == 0) return false;
        }
        return true;
    }
}
