package Practice_Problems;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// getting the input from the user
		Scanner input=new Scanner(System.in);
		// getting the starting interval(SI)
		int SI=input.nextInt();
		// getting the ending interval(EI)
		int EI=input.nextInt();
		for (int i = SI; i <= EI; i++) {
            if (i == 1 || i == 0)
                continue;
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
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
