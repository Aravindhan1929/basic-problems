package GiftCard;
import java.util.*;
public class ListOfDetials {
	Scanner input2=new Scanner(System.in);
	static ArrayList<BankDetials> customerDetials=new ArrayList<BankDetials>();
	private int accountIndex = -1;
	ListOfDetials(){
		System.out.println("Enter your Customer ID: ");
		int customerId=input2.nextInt();
		System.out.println("Enter your Password: ");
		String password=input2.next();
		if(isAccountExist(customerId,password)) {
			this.bankDetialsMainMenu(ListOfDetials.customerDetials.get(accountIndex));
		}else {
			System.out.println("Create a Bank Account or Enter the correst customerId and password...");
		}
	}
	
	
	void bankDetialsMainMenu(BankDetials obj) {
		while(true) {
			System.out.println("\n Enter your choise : \n 1.Check Balance \n 2.Deposit Money \n 3.Withdraw Money "
					+ "\n 4.Exit");
			int choise=input2.nextInt();
			switch(choise) {
			case 1:
				accountBalance(obj);
				break;
			case 2:
				
			}
			
		}
	}
	void depositingMoney(BankDetials obj) {
		obj.setBalance();
	}
	void withdrawMoney(BankDetials obj) {
		System.out.println("The current balance of your account is : "+obj.getBalance());
		System.out.println("Enter the amount that you want to withdraw :");
		long withdrawalAmount=input2.nextLong();
		
	}
	void accountBalance(BankDetials obj) {
		System.out.println("Your account balance is : "+obj.getBalance());
	}
	
	boolean isAccountExist(int customerid,String password) {
		for(BankDetials obj: customerDetials) {
			(this.accountIndex)++;
			if(customerid==obj.customerId && password.equals(obj.getPassword())) {
				return true;
			}
		}
		this.accountIndex=-1;
		return false;
	}

}
