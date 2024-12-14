package pgmJava;

import java.util.Scanner;

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int count=0;
for(int i=1 ;i<=n;i++)
			
		{
	
			if(i%2==0)
			{
			count++;
			}
		}
	System.out.println(count + " No of even number is range");
	}

}
