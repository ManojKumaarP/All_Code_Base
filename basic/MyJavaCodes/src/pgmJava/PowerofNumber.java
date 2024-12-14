package pgmJava;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number and power of number");
		int n=sc.nextInt(),m=sc.nextInt(), power=1;
		
		for(int i=0;i<n;i++)
		{
			power=power*m;
		}
		System.out.println(n+ " power of "+m+" is " +power);
	}

}
