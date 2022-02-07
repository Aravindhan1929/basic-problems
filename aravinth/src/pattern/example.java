package pattern;
import java.util.Scanner;
public class example {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int j=0;j<=((a*2-1)/2)-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
