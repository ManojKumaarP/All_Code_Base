package part2Java;

public class SubClass extends SuperClass {
	
	public SubClass()//Constructor
	{
		super();
		System.out.println("Im the Sub Class");
	}

	public void view() {//Child method
		
		super.view();//Superclass Method
		
		System.out.println("Im the Circle method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass s =new SubClass();
		s.view();
		
	}

}
