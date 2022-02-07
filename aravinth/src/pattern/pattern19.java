package pattern;
import java.util.Scanner;
public class pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a;i>0;i--) {
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
					if(j<i) {
						System.out.print("+");
					}
				}
			}
			else {
				for(int j=i;j>0;j--) {
					System.out.print(j);
					if(j!=1) {
						System.out.print("+");
					}
				}
			}
			System.out.println();
		}

	}

}
