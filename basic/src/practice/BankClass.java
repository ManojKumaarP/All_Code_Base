package practice;

import java.util.Scanner;

public class BankClass {

	//Bank_Parent class
	
	String name;
	long accNumber;

 int pin=0000;
	private double balance;
	Scanner sc = new Scanner(System.in);
	
	//Loading the values to object
	public BankClass(String name, long aN , double balance)
	{
		this.name= name;
		aN=accNumber;
		this.balance=balance;
		
	}

	
	//Method for scenario 
	
	public void withdrawAmount(int pin)
	{
		
		if(this.pin == pin)
		{
			System.out.println("enter amout to be debited");
			double amount= sc.nextDouble();
			
			if(amount > balance)
			{
				System.out.println("Amount entered is exceeding your balance");
			}
			else {
				balance = balance-amount;
				System.out.println("Amount debited and you balance is "+ balance);
			}
		}
		else {
			System.out.println("Enter valid  pin");
		}
	}
}

