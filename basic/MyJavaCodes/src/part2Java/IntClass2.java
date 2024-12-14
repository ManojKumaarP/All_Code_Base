package part2Java;

public class IntClass2 implements Int{
	
	public void m1()
	{
		System.out.println("Hi from second child");
		System.out.println(f);
//		f=11.22 Final var cannot be changed or updated.
	}

	public static void main(String[] args) {
		Int a=new IntClass2();
		a.m1();
	}
}
