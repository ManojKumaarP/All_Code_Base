package practice;

import java.util.Scanner;

public class SwitchCase {

	private static final String A = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter action");
		char ch = sc.next().charAt(0);
		
		
		switch (ch) {
		case 'A':
			System.out.println("Hello1");			
			break ;
		case 'B':			
			System.out.println("Hello2");			
			break ;
		case 'c':	
			System.out.println("Hello3");
				break ;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

	}

}
