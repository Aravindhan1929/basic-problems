package basicprogramming;
import java.util.Scanner;
public class PrimeWithinIntervals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int a, b, i, j, flag;
        System.out.printf("Enter lower bound of the interval: ");
        a = input.nextInt();
        System.out.printf("\nEnter upper bound of the interval: ");
        b = input.nextInt();
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }

	}

}
