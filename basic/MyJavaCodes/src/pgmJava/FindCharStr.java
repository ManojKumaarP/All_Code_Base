package pgmJava;

import java.util.Scanner;

public class FindCharStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		System.out.println();
		
		System.out.println("Enter the char needs to be searched");
		char c=sc.next().charAt(0);
		int count=0;
		//boolean b=false;
		
		for(int i=0;i<s.length();i++)
		{
			int f=s.charAt(i);
			
			if(f==c)
				{ 
				count++;
				//b=true;
				}
			
		}
		
		if(count>0)
		System.out.println("The character "+c+" is present in String "+s+ " and "+count+ " times");
		
		  else 
			  System.out.println("The Character "+c+" Is not present in the String "+s);
		 
		
		/*
		 * if(b==true) System.out.println("The Character "+c+
		 * " Is present in the String '"+s+"'"); else System.
		 * out.println("The Character "+c+ " Is not present in the String '"+s+"'");
		 */
	}

}
