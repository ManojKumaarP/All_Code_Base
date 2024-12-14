package siq;

import java.util.Scanner;

public class OnlyVowels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value ");
		String ip  =sc.nextLine();
		for(int i=0;i<ip.length();i++)
		{
			char a=ip.charAt(i);
			int countVowel=0;
			if(a=='a' || a== 'e' || a=='i' || a=='o' || a=='u' 	
					|| a =='A' || a== 'E' || a=='O' || a=='I' || a=='U')
			System.out.println(a);
	}
}
}
