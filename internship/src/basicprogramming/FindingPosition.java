package basicprogramming;
import java.util.Scanner;
public class FindingPosition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		System.out.println("enter the element to find");
		int position=input.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(position==array[i]) {
				System.out.println(i);
				count++;
			}
			else {
				continue;
			}
		}
		if(count<=0) {
			System.out.println("No such element in this array"+" -1");
		}

	}

}
