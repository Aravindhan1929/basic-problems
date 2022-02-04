package basicprogramming;
import java.util.Scanner;
public class centigradetofahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float celsius = input.nextFloat(); 
        float fahrenheit =( (celsius*9)/5)+32; 
        System.out.println(fahrenheit);
	}

}
