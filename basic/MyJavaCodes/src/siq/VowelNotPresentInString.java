package siq;

import java.util.Scanner;

public class VowelNotPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value ");
		String ip  =sc.nextLine();
		char[] vowels= {'a','e','i','o','u'};
		int n=ip.length();
		for(int i=0;i<n;i++)
		{ 
			char vow=ip.charAt(i);
		
			for(int j=0;j<vowels.length;j++)
			{	
				char ch=vowels[i];
				
				if(vow==ch)
				{
					System.out.println(ch);
				}
			}
			
		}
		
	}
	
	}


