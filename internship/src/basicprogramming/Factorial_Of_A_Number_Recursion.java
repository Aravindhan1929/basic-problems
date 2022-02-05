package basicprogramming;
import java.util.Scanner;
public class Factorial_Of_A_Number_Recursion {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
        long factorial = multiplyNumbers(number);
        System.out.println("Factorial of " + number + " = " + factorial);
	}
	public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}
