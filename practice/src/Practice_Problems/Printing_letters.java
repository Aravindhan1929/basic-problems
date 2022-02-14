package Practice_Problems;
import java.util.Scanner;
public class Printing_letters {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int b=input.nextInt();
		char a='A';
		for(int i=0;i<b;i++) {
			System.out.print(a);
			a++;
		}
		input.close();

	}

}
