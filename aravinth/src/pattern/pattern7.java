package pattern;
import java.util.Scanner;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1;
		int b=sc.nextInt();
		for(int i=1;i<b;i++) {
			for(int j=1;j<=i;j++) {
				if(a<=b) {
					System.out.print(a);
					a++;
				}
				else {
					break;
				}
			}
			System.out.println();
		}

	}

}
