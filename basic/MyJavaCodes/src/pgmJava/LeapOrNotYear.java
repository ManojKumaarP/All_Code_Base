package pgmJava;

import java.util.Scanner;

public class LeapOrNotYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		int n=sc.nextInt();
		year(n);
		
	}
	public static void year(int n) {
		
		if((n%4==0 && n%100!=0 ) || (n%400 == 0))
			System.out.println(n+" Is a Leap Year");
		else
			System.out.println(n+" Is not a Leap Year");
	}

}
