package basicprogramming;
import java.util.Scanner;
public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
//		char character = input.next().charAt(0); 
		String name="Aravinth";
		String vowels="aeiouAEIOU";

//        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
//            System.out.println(character + " is vowel");
//        else
//            System.out.println(character + " is consonant");
		for(int i=0;i<name.length();i++) {
			char character=name.charAt(i);
			if(vowels.contains(String.valueOf(character))) {
				System.out.println(character);
			}
//			if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A'|| character=='E'|| character=='I'|| character=='O'|| character=='U') {
//				System.out.println(character);
//			}
		}

	}

}
