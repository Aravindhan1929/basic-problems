package basicprogramming;
import java.util.Scanner;
public class Reverse_Of_String {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str = input.nextLine();
		Reverse_Of_String.reverse(str);
	}
	static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

}
