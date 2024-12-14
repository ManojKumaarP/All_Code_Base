package DeepDiveJava;import org.openqa.selenium.devtools.v113.emulation.model.DisplayFeature;

public class ScopeOfVaribles {
	
	static String globalvar1 ="Iam Static Global and i can be updated";
	String globalVar ="Iam NonStatic Global and i can be updated";
	int a =50;
   
	
	public static void main(String[] args) {
		
		final String localvar2 ="Iam NonStatic final Local and i cannot be updated";//Static cannot be used in main method only final
		String localvar1 ="Iam NonStatic Local and i can be updated";
		
		globalvar1="asdfgh";
		new ScopeOfVaribles().globalVar="dfghj";
		
		System.out.println(globalvar1 );
		System.out.println(localvar1);
		System.out.println(localvar2);
		
		System.out.println(new ScopeOfVaribles().a);
		ScopeOfVaribles ob = new ScopeOfVaribles();
		
		System.out.println(ob.globalVar);// Nonstatic varibles only called using object
		
		globalvar1 ="Im trying to update the global";
		System.out.println(globalvar1);
		
		//localvar2 = "Im trying to update the local"; //but not possible since i am final. 
		
		int a=10;
		{
			System.out.println(a);//
		}
		
		
		
	}
	
}
