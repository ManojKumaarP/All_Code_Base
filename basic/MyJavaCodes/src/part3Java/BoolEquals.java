package part3Java;

public class BoolEquals {
	String name;

	public BoolEquals(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public BoolEquals() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoolEquals b1 = new BoolEquals("Hello");
		BoolEquals b2 = new BoolEquals("bello");

		BoolEquals b3 = new BoolEquals();

		b3 = b1;

		System.out.println("b1 and b2 address are " + b1.equals(b2));// Comparing reference of b1 and b2

		System.out.println("b1 and b3 address are " + b1.equals(b3));//

		//System.out.println("b1 and b2 name values are "+b1.name.equals(b2.name));
	}

	
	 public boolean equals(BoolEquals ob) { 
		 
		 if(this.name ==ob.name)
			 return true ;
		else 
		return false; }
	 
}
