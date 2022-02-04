package basicprogramming;
import java.util.Scanner;
public class Alphabetornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char character=input.next().charAt(0);
		if( (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
			System.out.println(character +" is alphabet");
		}
		else {
			System.out.println(character +" is not alphabet");
		}

	}

}
