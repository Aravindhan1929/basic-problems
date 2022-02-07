package pattern;
import java.util.Scanner;
public class pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a*2;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<b-2;j++) {
				System.out.print(" ");
			}
			b=b-2;
			for(int j=1;j<i*2;j++) {
				System.out.print("**");
			}
			System.out.println();
		}

	}

}
