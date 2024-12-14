package pgmJava;

import java.util.Scanner;

public class BigOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value a");
		int a=sc.nextInt();
		System.out.println("Enter value b");
		int b=sc.nextInt();
		
		big(a,b);
	}
	
	public static void big(int a, int b)
	{
		if(a>b)
			System.out.println(a+" is bigger");
		else
			System.out.println(b+ " is bigger");
	}
}
