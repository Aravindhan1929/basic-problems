package internship;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a;i>0;i--) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int j=a-i;j<a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
