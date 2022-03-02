package OOPS;
import java.util.Scanner;
public class Patter_Printing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String input1=input.nextLine();
		String temp=input1+input1+input1;
		Patter_Printing.printpattern(temp);
		input.close();
	}
	public static void printpattern(String temp) {
		for(int i=0;i<(temp.length()/2)+1;i++) {
			for(int j=temp.length()/2-i;j<(temp.length()/2);j++) {
				System.out.print(" ");
			}
			for(int j=i;j<temp.length()-i;j++) {
				System.out.print(temp.charAt(j));
			}
			System.out.println();
		}
	}
}
