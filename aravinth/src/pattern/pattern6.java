package pattern;
import java.util.Scanner;
public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
		}
		for(int i=a-1;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
