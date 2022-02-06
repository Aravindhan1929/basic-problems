package basicprogramming;
import java.util.Scanner;
public class Pyramid_Pattern_5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for(int i=9;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=a;j++) {
				System.out.print(j);
			}
			for(int j=a-1;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
