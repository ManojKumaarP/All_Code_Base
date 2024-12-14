package part2Java;
import java.util.*;
public class BookBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in); 
	    
		System.out.println("Enter the type of bus to book AC or SEMI Sleeper");
		String s=sc.nextLine();
		
		if(s.equals("AC"))
		{

		AcSleeper b=new AcSleeper();
		
		ticket(b);
		}
		
		else if(s.equals("SEMI"))  {
			SemiSleeper p=new SemiSleeper();
			ticket(p);
		}
		
		else {
			System.out.println("Inavlid Input");
		}
	
	}
	public static void ticket(Bus ob)
	{
		
		if(ob instanceof AcSleeper)
		{
			AcSleeper ac=(AcSleeper)ob;
			ac.featurs();
			ac.cost();
		}
		else if(ob instanceof SemiSleeper)
		{
			SemiSleeper sc=(SemiSleeper) ob;
			sc.featurs();
			sc.cost();
		}
	}
}
