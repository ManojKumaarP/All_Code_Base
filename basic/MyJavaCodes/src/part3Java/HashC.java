 package part3Java;

import java.util.HashMap;
import java.util.HashSet;

public class HashC implements Comparable<HashC>{

	String name;
	int price;
	
	public HashC(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("vvv");
		hs.add("bab");
		hs.add("hhh");
		/*
		 * hs.add(new HashC("Pen",567)); hs.add(new HashC("Paper",457)); hs.add(new
		 * HashC("Pencil",767));
		 */
		/*
		 * System.out.println("H1 address is "+h1.hashCode());
		 * System.out.println("H2 address is "+h2.hashCode()); System.out.println();
		 * System.out.println("Is h1 and h2 are same ? "+h1.equals(h2));
		 * System.out.println();
		 * 
		 * 
		 * h3=h1;
		 * 
		 * System.out.println("H1 address is "+h1.hashCode());
		 * System.out.println("H3 address is "+h3.hashCode()); System.out.println();
		 * System.out.println("Is h1 and h3 are same ? "+h3.equals(h1));
		 */
		System.out.println(hs);
	}

	public int compareTo(HashC ob) {
		if(this.name.compareTo(ob.name)>0)
			return 1;
		else if (this.name.compareTo(ob.name)<0)
			return -1;
		else 
			return 0;
	}
	
	public String toString()
	{
		return name;
	}
	
}
