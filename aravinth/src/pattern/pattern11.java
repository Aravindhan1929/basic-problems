package pattern;
import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			for(int j=a-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=b;j++) {
				if(j%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			}
			b=b+2;
			System.out.println();
		}

	}

}
