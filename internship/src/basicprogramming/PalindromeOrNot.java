package basicprogramming;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 int r=0;
		 int sum=0;   
		 int n=input.nextInt();
		  int temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) {    
		   System.out.println("palindrome number "); 
		  }
		  else {    
		   System.out.println("not palindrome");  
		  }

	}

}
