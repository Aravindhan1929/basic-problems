package Practice_Problems;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name=input.next();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		if(name.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
