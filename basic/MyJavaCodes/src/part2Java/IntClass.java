package part2Java;

public class IntClass implements Int{

	public void m1()
	{
		System.out.println("Hi from child");
	}
	
	public static void main(String[] args) {
		IntClass i= new IntClass();
			i.m1();
	}
}
