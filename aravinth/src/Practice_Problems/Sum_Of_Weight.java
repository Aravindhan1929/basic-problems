package Practice_Problems;
import java.util.Scanner;
public class Sum_Of_Weight {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=input.nextInt();
		}
		for(int i=0;i<size;i++) {
			int count=0;
			if(isPerfectSquare(array[i])) {
				count+=5;
				if(array[i]%4==0 && array[i]%6==0) {
					count+=4;
					if(array[i]%2==0) {
						count+=3;
						System.out.println(count+" "+array[i]);
					}else {
						System.out.println(count+" "+array[i]);
					}
				}else {
					System.out.println(count+" "+array[i]);
				}
			}
			else if(array[i]%4==0 && array[i]%6==0){
				count+=4;
				if(array[i]%2==0) {
					count+=3;
					System.out.println(count+" "+array[i]);
				}else {
					System.out.println(count+" "+array[i]);
				}
			}else if(array[i]%2==0) {
				count+=3;
				System.out.println(count+" "+array[i]);
			}else {
				System.out.println(count+" "+array[i]);
			}
		}
	}
	static boolean isPerfectSquare(int x)
    {
		if (Math.ceil((double)Math.sqrt(x)) ==
		        Math.floor((double)Math.sqrt(x)))
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
    }
}
