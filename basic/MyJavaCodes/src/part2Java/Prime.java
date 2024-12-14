package part2Java;


public class Prime extends Cab {

		public void book() { //overridden method
			
			System.out.println("Welcome book your prime cab");
		}
		
		public void price() {
			
			System.out.println("90 Rs per Km");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cab m=new MiniCab();
//		m.book();
//		MiniCab a=(MiniCab)m;
//		a.price();
		Prime m1=new Prime();
		ride(m1);
	}
	
	public static void ride(Cab c)
	{
		c.book();
		if(c instanceof MiniCab)
		{
			MiniCab mc=(MiniCab)c;
			mc.price();
		}
		else
		{
			Prime p=(Prime)c;
			p.price();
		}
	}
}

