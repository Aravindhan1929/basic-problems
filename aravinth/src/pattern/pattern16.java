package pattern;
import java.util.Scanner;
public class pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a+1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(" ");
			}
			b=b-1;
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
