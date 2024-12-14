package pgmJava;

import java.util.Scanner;

public class SumOFEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt() , sum =0 ;
		
		for (int i = 1; i <=n; i++) {
			
			if(i % 2==0)
				sum+=i;
		}
		System.out.println("The sum of even numbers between "+ n+ " is " +sum);
	}

}
