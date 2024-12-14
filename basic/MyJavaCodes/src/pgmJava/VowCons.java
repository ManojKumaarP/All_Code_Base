package pgmJava;

import java.util.Scanner;

public class VowCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value ");
		char ch=sc.next().charAt(0);
		findChar(ch);	
	}
	public static void findChar(char a) {
		
		if(a=='a' || a== 'e' || a=='i' || a=='o' || a=='u' 	
				|| a =='A' || a== 'E' || a=='O' || a=='I' || a=='U')
			System.out.println(a + " Is a Vowel");
		else
			System.out.println(a + " Is a Consonant");
					
	}
}
