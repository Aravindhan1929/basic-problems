package Practice_Problems;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		//getting input form the user
		Scanner input=new Scanner(System.in);
		int upperlimit=input.nextInt();
		int lowerlimit=input.nextInt();
		for(int i=upperlimit;i<=lowerlimit;i++) {
			if(answer(i)) {
				System.out.println(i);
			}
		}
	}
	// find the whether the number is fibonacci number or not
	public static boolean answer(int n) {
		int a = 0;
        int b = 1;
        if (n==a || n==b) return true;
        int c = a+b;
        while(c<=n)
        {
            if(c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
	}
}
