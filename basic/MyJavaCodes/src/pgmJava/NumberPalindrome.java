package pgmJava;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=n,rev=0;
		
		while(n!=0)
		{
			int l=n%10;
			rev=rev*10+l;
			n=n/10;
		}
		if(temp==rev)
		System.out.println(temp +" is a palindrome");
		else
			System.out.println(temp +" is not a palindrome" );
	}

}
