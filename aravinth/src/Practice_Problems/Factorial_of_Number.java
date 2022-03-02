package Practice_Problems;
import java .util.Scanner;
public class Factorial_of_Number {

	public static void main(String[] args) {
		//getting the input from user
				Scanner input=new Scanner(System.in);
				//getting the lower limit
			    int fromlimit=input.nextInt();
			    //getting the upper limit
			    int tolimit=input.nextInt();
			    for(int i=fromlimit; i<=tolimit; i++) {  
			    	Long factorial=1L;
					for(int j=1;j<=i;j++) {
						factorial=factorial*j;
					}
					System.out.println(factorial);  
				}
	}

}
