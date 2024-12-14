package part2Java; 

public class TailoringMac implements Machine{

	public void use()
	{
		System.out.println("Im tailoring Machine");
		System.out.println("Per Cloth charges is 500 Rupees and ");
		
	}
	public void cost(int a)
	{
		System.out.println("Total Cost is "+ a*500);
	}
	
}
