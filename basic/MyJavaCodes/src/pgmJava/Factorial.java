package pgmJava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		factorial(n);
	}

public static void factorial(int n) {
		
	int sum=1;
		for(int i=1;i<=n;i++ )
		{
			sum*=i;
		}
		System.out.println(sum);
}
}
