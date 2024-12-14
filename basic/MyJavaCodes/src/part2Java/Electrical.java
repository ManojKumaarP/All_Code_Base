package part2Java;

public class Electrical extends Engineer{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Hi Iam Electrical Engineer");
	}

	public void display()
	{
		System.out.println("002");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Civil c=new Civil();
		exe(c);
		
	}
	
	public static void exe(Engineer e)
	{
		e.work();
		if (e instanceof Civil)
		{
			Civil a=(Civil)e;
			a.display();
		}
		else {
			Electrical b=(Electrical)e;
			b.display();
		}
	}
	
}
