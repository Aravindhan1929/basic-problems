package OOPS;
import java.util.Scanner;
public class Constructor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int input1=input.nextInt();
		String input2=input.next();
		Solution obj=new Solution(input1);
		Solution obj2=new Solution(input2);
		obj.answer();
		obj2.answer();
		input.close();
	}
}
class Solution{
	private String input1;
	private int input2;
	public Solution(int input){
		input2=input;
	}
	public Solution(String input) {
		input1=input;
	}
	public void answer() {
		System.out.println(input1);
		System.out.println(input2);
	}
}
