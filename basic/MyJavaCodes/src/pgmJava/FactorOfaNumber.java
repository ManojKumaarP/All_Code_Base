package pgmJava;

import java.util.Scanner;

public class FactorOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		fact(n);
	}
	public static void fact(int n) {
		
		for(int i=1;i<=n;i++ )
		{
			if(n % i == 0)
			{
				System.out.println("The factorial of "+n+ " is " +i);
			}
		}
	}
}
