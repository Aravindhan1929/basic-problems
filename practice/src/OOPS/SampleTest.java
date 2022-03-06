package OOPS;
import java.util.Scanner;
public class SampleTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=input.nextInt();
		int[] arr=new int[3];
		arr[0] =input.nextInt();
		arr[1] =input.nextInt();
		arr[2] =input.nextInt();
		int temp=arr[0];
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
		System.out.println(arr[0]*total-2+arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}

