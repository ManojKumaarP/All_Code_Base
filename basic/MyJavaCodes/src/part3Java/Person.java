package part3Java;

import java.util.*;

import part2Java.P;
public class Person implements Comparable<Person>{

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> a= new ArrayList<>();
		a.add(new Person("Abc",22));
		a.add(new Person("Bbc",24));
		a.add(new Person("Dcec",25));
		a.add(new Person(null,56));
		
		System.out.println("Array list : "+ a);
		System.out.println();
		
		HashSet<Person> h= new HashSet<>(a);
		h.add(new Person("Abc",22));
		System.out.println("Hash Set"+ h);
		System.out.println();
		
		LinkedHashSet<Person> l=new LinkedHashSet<>(h);
		l.add(new Person("Bye",0));
		System.out.println("Linked Has Set"+l);
		System.out.println();
		
		try {
		TreeSet<Person> t=new TreeSet<>(l);
		System.out.println(t);}
		catch(NullPointerException e)
		{
			System.out.println("Tree cannot accept Null values, kindly remove and execute");
			
		}
	}
	
	public String toString()
	{
		return name +" "+age;
	}

	@Override
	public int compareTo(Person ob) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(ob.name)>0)
			return 1;
		else if(this.name.compareTo(ob.name)<0)
			return -1;
		else
		return 0;
	}

}
