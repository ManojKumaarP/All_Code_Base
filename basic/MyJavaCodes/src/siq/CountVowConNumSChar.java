package siq;

import java.util.Scanner;

public class CountVowConNumSChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value ");
		String ip  =sc.nextLine();
		int countVowel=0 , countConsnant=0,countNumber=0,countSpecialChar=0;
		for(int i=0;i<ip.length();i++)
		{
			char a=ip.charAt(i);
			if(a=='a' || a== 'e' || a=='i' || a=='o' || a=='u' 	
					|| a =='A' || a== 'E' || a=='O' || a=='I' || a=='U')
			countVowel++;
			else if(a>='0' && a<='9')
				countNumber++;
			else if(a<='a' && a>='z')
				countSpecialChar++;
			else
				countConsnant++;		
		
	}
		System.out.println(countVowel);
		System.out.println(countConsnant);
		System.out.println(countSpecialChar);
		System.out.println(countNumber);
	}
	}
