package pgmJava;

import java.util.Scanner;

public class MaxCharWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine(), temp="";
		String [] str=s.split(" ");
		String max="";
		for(int i=0;i<str.length;i++)
		{
			
			if(str[i].length()>max.length())
				max=str[i];
			
		}
		System.out.println(max + "  Has maximum words");
		
	}

}
