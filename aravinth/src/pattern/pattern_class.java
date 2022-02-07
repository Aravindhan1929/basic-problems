package pattern;
import java.util.Scanner;
public class pattern_class {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=0;j<a-i;j++) {
				System.out.print("@");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("%");
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print("%");
			}
			for(int j=0;j<a-i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
