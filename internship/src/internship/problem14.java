package internship;
import java.util.Scanner;
public class problem14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=sc.nextInt();
		System.out.println("enter the height");
		int h=sc.nextInt();
		float ans=2*2.14f*(float)r*(float)h+2*2.14f*(float)r*(float)r;
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
