package basicprogramming;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number1=input.nextInt();
		int number2=input.nextInt();
		while(number1!=number2)   
		{  
		if(number1>number2)  
		number1=number1-number2;  
		else  
		number2=number2-number1;  
		}  
		System.out.printf("GCD of number1 and number2 is: " +number2);

	}

}
