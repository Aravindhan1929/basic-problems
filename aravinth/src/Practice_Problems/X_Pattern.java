package Practice_Problems;
import java.util.Scanner;
public class X_Pattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
			String str = input.nextLine();
		    int size = str.length();
		if(size%2==0) {
			throw new Exception("the given input is even number");
		}else {
			for (int i = 0; i < size; i++)
		    {
		        int j = size - 1 - i;
		        for (int k = 0; k < size; k++)
		        {
		            if (k == i || k == j)
		                System.out.print(str.charAt(k));
		            else
		                System.out.print(" ");
		        }
		        System.out.println("");
		    }
		}

		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
