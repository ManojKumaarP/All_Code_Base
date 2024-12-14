package pgmJava;

import java.util.Scanner;

public class SwapTwoWt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value a");
		int a=sc.nextInt();
		System.out.println("Enter value b");
		int b=sc.nextInt();
		System.out.println("Value of a is "+a+"Value of b "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a is "+a+"Value of b "+b);
		
	}

}
