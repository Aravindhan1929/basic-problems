package pattern;
import java.util.Scanner;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print(b);
					b++;
				}
				System.out.println();
			}
			else {
				
			}
		}

	}

}
