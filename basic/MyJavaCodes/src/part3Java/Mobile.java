package part3Java;

public class Mobile {
	String brand;
	double price;
	String color;
	public Mobile(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
public static void main(String[] args) {
	
	Mobile m1= new Mobile("Motorola",55000d,"White");
	Mobile m2= new Mobile("SamSung",69000d,"Blue");
	Mobile m3= new Mobile("Oppo",15000d,"White");
	Mobile m4= new Mobile("RealMe",8000.50d,"Black");
	Mobile m5= new Mobile("Apple",205000d,"Stone Black");
	
	Mobile m[]= {m1,m2,m3,m4,m5};
	
	for(int i=0;i<m.length;i++)
	{
		if(m[i].price>40000 )
		{
			m[i].display();
		}
	}
}
public   void display()
{
	System.out.println();
	System.out.println("The brand of the mobile is : "+brand );
	System.out.println("The price of the mobile is : "+price);
	System.out.println("The Color of mobile is :"+color);
	
	
	
	}
}
	

