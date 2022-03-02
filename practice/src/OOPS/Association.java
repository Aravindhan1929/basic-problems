package OOPS;

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()+ " is employee of "+ bank.getBankName());   
        //bank has many employees so it is one to many employees
	}
}
class Bank {
	 
    // Attributes of bank
    private String name;
 
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
}
class Employee {
    // Attributes of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}
