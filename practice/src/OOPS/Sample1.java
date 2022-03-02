package OOPS;
import java.util.*;
public class Sample1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] arr=new int[size];
		List<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++) {
			int c=0,d=0;
			for(int j=size-i;j<size;j++) {
				c=c+arr[j];
			}
			for(int j=0;j<size-i;j++) {
				d=d+arr[j];
			}
			a.get(0).add(i,c);
			a.get(1).add(i,d);
		}
		int answer=ans(a);
		
	}
	public static int ans(List<ArrayList<Integer>> a) {
		int b=a.size();
		int[] c=new int[b];
		for(int i=0;i<b;i++) {
			c[i]=a.get(0).get(i)-a.get(1).get(i);
		}
		int j=minimum(c);
		int l=0;
		for(int k=0;k<b;k++) {
			if(j==c[k]) {
				l=k;
				break;
			}
		}
		if(a.get(0).get(l)>a.get(1).get(l)) {
			return a.get(0).get(l);
		}else {
			return a.get(1).get(l);
		}
	}
	public static int minimum(int[] a) {
		int temp;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
	}
}
