package part2Java;

public class MultiplyOverload {

	public static void multi(int a)
	{
		int m=10;
		System.out.println("The Multiplication with one integer with " + m +" is :" +m*a );
		System.out.println();
	}
	public static void multi(float a , float b)
	{
		float m=10.0f;
		System.out.println("The Multiplication with two float with " + m +" is :" +m*a*b );
		System.out.println();
	}
	public static void multi(int a , int b , int c)
	{
		int m=10;
		System.out.println("The Multiplication with three integers with " + m +" is :" +m*a*b*c );
	}
	public static void main(String[] args) {
			
		System.out.println("********Welcome to Multiplication World***********");
		System.out.println();
		
		multi(10);
		
		multi(23.3f , 11.11f);
		
		multi(3 ,4,5);
	}

}
