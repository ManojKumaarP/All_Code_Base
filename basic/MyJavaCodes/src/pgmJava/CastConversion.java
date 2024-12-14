package pgmJava;

import java.util.Scanner;

public class CastConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch=sc.next().charAt(0);
		convertChar(ch);	
	}
	public static void convertChar(char a) {
		
		if(a>='a' && a<='z'  )  
		{
			//char ch =(char)(a-32);
			System.out.println((char)(a-32));
		}
		else if( a>='A' && a<='Z')
		{
			char ch =(char)(a+32);
			System.out.println(ch);
		}
		else 
			System.out.println( a + " Is a Invalid");
	}

}
