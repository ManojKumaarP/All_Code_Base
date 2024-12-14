package pgmJava;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int count=0,countp=0;
   for(int i=1 ;true;i++)
			
		{
	   int m=i;
	   for (int j=1;j<=m;j++)
	   {
	
			if(m%j==0)
			{
			count++;
			if(count==2)
			{
				countp++;
				if(countp==n)
				{
					System.out.println(m);
					break;
				}
			}
			}
		}
	
		
	}
	}

}
