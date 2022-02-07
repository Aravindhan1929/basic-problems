package pattern;
import java.util.Scanner;
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		int c=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(b);
			}
			for(int j=1;j<=a-i;j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
