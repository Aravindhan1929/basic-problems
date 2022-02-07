package pattern;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a+a-1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=b-2;k++) {
				System.out.print(i);
			}
			b=b-2;
			for(int l=i;l>0;l--) {
				if(l==a) {
					continue;
				}
				System.out.print(l);
			}
			System.out.println();
		}
		b=1;
		for(int i=a-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=b;k++) {
				System.out.print(i);
			}
			b=b+2;
			for(int l=i;l>0;l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	    

	}

}
