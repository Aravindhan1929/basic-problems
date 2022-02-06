package basicprogramming;
import java.util.Scanner;
public class Pyramid_Partten1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int j=a-i;j<a;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
