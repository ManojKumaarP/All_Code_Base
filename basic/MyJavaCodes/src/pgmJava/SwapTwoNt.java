package pgmJava;

import java.util.Scanner;

public class SwapTwoNt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value a");
		int a=sc.nextInt();
		System.out.println("Enter value b");
		int b=sc.nextInt();
		System.out.println("Value of a is "+a+" Value of b is "+b);
		System.out.println();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a is "+a+" Value of b is "+b);
		
	}

}
