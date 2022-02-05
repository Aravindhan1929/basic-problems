package basicprogramming;
import java.util.Scanner;
public class Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
	}
	public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

}
