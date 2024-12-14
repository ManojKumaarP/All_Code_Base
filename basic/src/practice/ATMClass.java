package practice;

import java.util.Scanner;

public class ATMClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankClass b1= new BankClass("Maddy", 813438, 34343.45);
		
		debit(b1);
		
	}
	
	public static void debit(BankClass b)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin number");
		int pin=sc.nextInt();
		b.withdrawAmount(pin);
	}
	

}
