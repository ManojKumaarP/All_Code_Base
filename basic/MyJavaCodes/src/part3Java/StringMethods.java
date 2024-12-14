package part3Java;

public class StringMethods {

	public static void main(String[] args) {
	
		String a="albatroz";
		System.out.println("The Length of the string is "+a.length());
		
		String b=a.toUpperCase();
		System.out.println("UpperCase " + b);
		
//		String l=a.toLowerCase();
//		System.out.println("LowerCase " + a);
//		
		char ch=a.charAt(5);//9 index is out of bound exception.
		System.out.println("The index value is " + ch);
		System.out.println();
		
		//to get each each letter from string
		for (int i = 0; i < b.length(); i++) {
			
			System.out.println(b.charAt(i));
		}
		System.out.println();
		
		System.out.println("The occurance of 'a' is " +a.lastIndexOf( 'a'));
		
		System.out.println("The index value 'b' is " + b.indexOf('B'));
		
		System.out.println(a.indexOf('a',2));
		
	}
}
