package part3Java;

public class Student {
	
	String name;
	
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Abc");
				
		System.out.println(s1);
		// It prints the hashcode
		
		//System.out.println(s1.name);//This is implicit way
	}
	
	/*
	 * public String toString() 
	 * {
	 *  return name; //It is explicit way of over loading
	 * }
	 */
}
