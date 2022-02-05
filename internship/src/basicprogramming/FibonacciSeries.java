package basicprogramming;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n1=0,n2=1,n3,i;
		int count=input.nextInt();    
		 System.out.print(n1+" "+n2);
		 for(i=2;i<count;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}

}
