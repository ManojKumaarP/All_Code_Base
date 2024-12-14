package pgmJava;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		while(n!=0)
		{
			
			count++;
			n=n/10;
		}
		System.out.println("The Total digits in number is : "+count);
	}

}
