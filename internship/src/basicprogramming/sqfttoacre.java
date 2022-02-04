package basicprogramming;
import java.util.Scanner;
public class sqfttoacre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float sqft=input.nextFloat();
		float acre=(float)(sqft * 2.2957e-5);
		System.out.println(acre);

	}

}
