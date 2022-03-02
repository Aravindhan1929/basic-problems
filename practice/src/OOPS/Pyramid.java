package OOPS;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int temp=1;
		String a="*";
		for(int i=1;i<=size;i++) {
			if(i==temp && temp<=size) {
				System.out.print(a);
				temp++;
				a+="*";
			}
			System.out.println();
		}

	}

}
// 