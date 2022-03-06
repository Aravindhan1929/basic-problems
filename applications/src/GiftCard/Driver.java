package GiftCard;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("Enter your choice: \n 1. New Bank Account Creation \n 2. Add Money to your Bank account "
					+ "\n 3. Exit");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				new BankDetials();
				break;
			case 2:
				new ListOfDetials();
				break;
			case 3:
				System.out.println("\n\n Program Ending . . . \n\n");
                return;
            default:
                System.out.println("please enter a proper choice number");
				
			}
		}
		
		
	}

}
