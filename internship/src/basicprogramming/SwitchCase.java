package basicprogramming;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int grade=input.nextInt();
		switch(grade) {
		case 10: System.out.println("10");  
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break; 
	    default:System.out.println("Not in 10, 20 or 30");
		}
		}

	}


