package part2Java;

public class Laptop extends Gadget{

	public void use() {
		
		System.out.println("Welcome to Laptop Shopping Area");
		System.out.println("Choose your favorite Laptops");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=new Mobile();
		m.display();//parent method
		m.use();//Overridden method
		m.price();//Child method
		
		Laptop l=new Laptop();
		l.display();//Parent method
		l.use();//Overridden method
		
		/*Gadget g =new Mobile();
		g.use();
		g.display();*/
			
		}

}
