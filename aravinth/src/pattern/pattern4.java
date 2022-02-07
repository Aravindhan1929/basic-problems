package pattern;
import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1; i<=a; i++)
	    {
	        for(int j=a; j>a-i; j--)
	        {
	            System.out.print(j);
	        }

	        for(int j=1; j<=a-i; j++)
	        {
	            System.out.print(a-i+1);
	        }

	        System.out.println();
	    }

	}

}
