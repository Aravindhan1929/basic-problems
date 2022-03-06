package GiftCard;
import java.util.*;
public class BankDetials {
	Scanner input1=new Scanner(System.in);
	public static long customerId=1;
	public static long balance=0;
	private String name;
    private int age;
    private char gender;
    private long mobileNumber;
    private String city;
    private String password;
	BankDetials(){
		this.setName();
        this.setAge();
        this.setGender();
        this.setMobileNumber();
        this.setCity();
        this.setBalance();
        this.setPassword();
        ListOfDetials.customerDetials.add(this);
        System.out.println("This is your customer ID :"+this.customerId);
        (BankDetials.customerId)++;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
        return this.age;
    }

    char getGender() {
        return this.gender;
    }

    long getMobileNumber() {
        return this.mobileNumber;
    }

    String getCity() {
        return this.city;
    }
    long getBalance() {
    	return BankDetials.balance;
    }
    String getPassword() {
    	return this.password;
    }
    void setName() {
        System.out.println("Enter Name: ");
        this.name = input1.nextLine();
    }

    void setAge() {
        System.out.println("Enter Age: ");
        this.age = input1.nextInt();
    }

    void setGender() {
        System.out.println("Enter Gender: ");
        this.gender = input1.next().charAt(0);
    }

    void setMobileNumber() {
        System.out.println("Enter Mobile Number: ");
        this.mobileNumber = (input1.nextLong());
    }

    void setCity() {
        System.out.println("Enter City: ");
        this.city = input1.next();
    }
    void setBalance() {
    	System.out.println("Currently your account balance is : "+ balance);
    	System.out.println("Enter the amount that you wish to add in your account :");
    	BankDetials.balance=balance+input1.nextLong();
    	System.out.println("your current balance is :"+balance);
    	
    }
    void setPassword() {
    	System.out.println("Enter the password : ");
    	this.password=input1.next();
    }
    void withdrawalcash(long withdrawalCash) {
    	BankDetials.balance=balance-withdrawalCash;
    }
}
