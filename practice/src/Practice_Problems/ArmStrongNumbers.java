package Practice_Problems;
import java.util.Scanner;
public class ArmStrongNumbers {

	public static void main(String[] args) {
		//getting the input from user
		Scanner input=new Scanner(System.in);
		//getting the lower limit
	    int fromlimit=input.nextInt();
	    //getting the upper limit
	    int tolimit=input.nextInt();
	    for(int i=fromlimit; i<=tolimit; i++) {  
		    if(isArmstrong(i)) {  
		      System.out.print(i+ ", ");  
		}
	}

	}
	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0; 
	temp=n;  
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{     
	last = temp % 10;    
	sum +=  Math.pow(last,digits);
	temp = temp/10;   
	}  
	if(n==sum) {   
	    return true;
	}
	else {
		return false;   
	}
	}   

}
