package basicprogramming;
import java.util.Scanner;
public class sumofnaturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
