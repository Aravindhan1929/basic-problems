package OOPS;
import java.util.Scanner;
import java.util.Arrays;
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String str2=input.nextLine();
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		char arr1[] = str2.toCharArray();
		Arrays.sort(arr1);
		String a=new String(arr);
		System.out.println(a);
		String d=new String(arr1);
		StringBuffer b=new StringBuffer(d);
		b.reverse();
		System.out.println(b);
		String c="";
		for(int i=0;i<a.length();i++) {
			c=c+a.charAt(i)+b.charAt(i);
		}
		System.out.println(c);
		input.close();
	}

}
