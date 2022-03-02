package OOPS;
import java.util.*;

public class sample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		int[] arr=new int[] {0,1,0};
		List<Integer> list = new ArrayList<>();
		for(int a:arr) {
			list.add(a);
		}
		list.add(2,1);
		array(list);
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<size-i;j++) {
//				System.out.print(" ");
//			}
//			List<Integer> list = new ArrayList<>();
//	        for(int a: arr) {
//	            list.add(a);
//	        }
//	        for(int j=0;j<i+1;j++) {
//	        	int b=arr[j]+arr[j+1];
//	        	System.out.print(b+" ");
//	        	list.add(j+1,b);
//	        }
//	        int c=list.size();
//	        list.add(size-1,0);
//	        System.out.println();
//	        arr=array(list);
//		}
	}
	public static void array(List<Integer> a) {
		int size=a.size();
		int[] b=new int[size];
		for(int c:a) {
			b[c]=a.get(c);
		}
		for(int c:b) {
			System.out.println(b[c]);
		}
		
	}

}
