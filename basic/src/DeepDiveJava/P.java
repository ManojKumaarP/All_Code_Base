package DeepDiveJava;

public class P {
	public static void main(String[] args) {
	
		ScopeOfVaribles obj1 = new ScopeOfVaribles();//Class is an non primitive data which is used to store multi valued data
		ScopeOfVaribles obj2 = new ScopeOfVaribles();
		ScopeOfVaribles obj3 = new ScopeOfVaribles();
		
		//System.out.println(obj1 +" "+ obj2 + " " + " "+obj3);
		
		System.out.println(obj1.equals(obj3) + "  Obj1 " +obj1+" and obj3 "+obj3 +" address are not same");
			
	
		System.out.println(obj2.equals(obj3) + "  Obj2 " +obj2+" and obj3 "+obj3 +" address are not same");
			
		System.out.println(obj2.equals(obj1) + "  Obj2 j" +obj2+" and obj1 "+obj1 +" address are not same");
			
		
	}
}
