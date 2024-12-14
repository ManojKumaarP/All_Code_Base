package part3Java;

import java.util.Iterator;

public class StringArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ab[]= {"hellooo","Myworld","Wonderfull","Bye","OMG"};
		for (int i = 0; i < ab.length; i++) {
			
			if(ab[i].length()<5)
			{
				System.out.println("Literals having string length less than 5 :"+ab[i]);
			}
			if(ab[i].length()>5)
				System.out.println("Literals having string length More than 5 :"+ab[i]);
			System.out.println();
		}
	}

}
/*Store a string Bengaluru and print in reverse
 *Bike objects with details with price range 65k to 1 lakh
 *create a string array with 5 elements should be entered by user amd find length of each element and print */
 