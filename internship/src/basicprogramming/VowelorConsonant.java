package basicprogramming;
import java.util.Scanner;
public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char character = input.next().charAt(0); 

        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
            System.out.println(character + " is vowel");
        else
            System.out.println(character + " is consonant");

	}

}
