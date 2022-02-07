package pattern;
import java.util.Scanner;
public class pattern18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(i==a) {
				for(int j=1;j<=i;j++) {
					System.out.print(1);
				}
			}else {
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print(1);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}

	}

}
