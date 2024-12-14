package part2Java;

public class Q extends P{

	//Private class is mine only but i did not get from my parent class😥
	public void m1()
	{
		System.out.println("Im accessable of only Q");
	}
	public static void main(String[] args) {
		
		Q ob=new Q();
		ob.m1();
	}
}
