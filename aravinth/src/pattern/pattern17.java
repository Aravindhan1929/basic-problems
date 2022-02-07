package pattern;
import java.util.Scanner;
public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for (int i = 1; i <= a; i++)
        {
 
            for (int j = 1; j <= a - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
              System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
              System.out.print(l);
            }
 
            System.out.println();
        }

	}

}
