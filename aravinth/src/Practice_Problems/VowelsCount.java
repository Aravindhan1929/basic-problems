package Practice_Problems;
import java.util.Scanner;
public class VowelsCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String userInput = input.next();
        String ans = "";
        int count = 1;
        for(int i = 0; i < userInput.length()-1; i++) {
            if(userInput.charAt(i) == userInput.charAt(i+1)) {
                count++;
            } else {
                ans += userInput.charAt(i) + "" + count;
                count = 1;
            }
        }
        ans += userInput.charAt(userInput.length()-1) + "" + count;
        System.out.println("the ans: " + ans);
	}
}
