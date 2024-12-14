package pgmJava;

import java.util.Scanner;

public class CountEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		
		while(n!=0)
		{
			int l=n%10;
			if(l%2==0)
				sum+=l;
			n=n/10;
		}
		System.out.println(sum);
	}

}
