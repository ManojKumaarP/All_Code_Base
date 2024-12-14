package pgmJava;


import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),temp=n,sum=0;
		while(n!=0)
		{
			System.out.println(n);
			int l=n%10;
			sum=sum + fact(l);
			n/=10;
			//System.out.println(n);
		}
	if(sum==temp)
		System.out.println(temp + " is a Strong Number");
	else
		System.out.println(temp + " is not a Strong Number");
	}
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
			//34System.out.println(fact);
		}
		return fact;
		
		
	}
}
