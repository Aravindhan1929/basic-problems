package pattern;
import java.util.Scanner;
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=a;i>0;i--) {
			for(int j=i;j<=a;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
