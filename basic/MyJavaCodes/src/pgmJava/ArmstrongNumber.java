package pgmJava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(),temp=n,sum=0;
		while (n!=0)
		{	int l=n%10;
			sum=sum+power(l,count(temp));
			n/=10;
		}
		if(temp==sum)
			System.out.println(temp + " is a ArmStrong Number");
		else
			System.out.println(temp + " is not a ArmStrong Number");
	}
	public static int count(int n) {
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	public static int power(int m, int n) {
		
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power*=m;
		}
		return power;
	}

}
