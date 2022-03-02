package OOPS;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class sample2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		if(size!=0) {
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		int f1=arr[0];
		int f2=arr[size-1];
		int i=1,j=size-2;
		int count=0;
		while(count<size-2) {
			if(f1<=f2) {
				f1+=arr[i];
				i++;
			}else {
				f2+=arr[j];
				j--;
			}
			count++;
		}
		if(f1<f2) {
			System.out.println(f2);
		}else {
			System.out.println(f1);
		}
		}
		else {
			System.out.println("0");
		}

	}

}
