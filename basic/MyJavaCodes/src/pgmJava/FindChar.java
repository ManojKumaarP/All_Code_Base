package pgmJava;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch=sc.next().charAt(0);
		findChar(ch);	
	}
	public static void findChar(char a) {
		
		if(a>='a' && a<='z' || a>='A' && a<='Z' )                  
			System.out.println(a + " Is a Vowel");
		else if(a>='1' && a<='9')
			System.out.println(a + " Is a Number");
		else 
			System.out.println( a + " Is a Special character");
	}

}
