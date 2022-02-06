package basicprogramming;
import java.util.Scanner;
public class Inverted_Pyramid_Pattern_7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for(int i=a;i>0;i--) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
