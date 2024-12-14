package pgmJava;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value a");
		int a=sc.nextInt();
		
		if(a>0)
			System.out.println("Positive number");
		else if(a<0)
			System.out.println("Negative Number");
		else
			System.out.println("Zero");
	}

}
