package part2Java;

import java.util.Scanner;

public class AcSleeper implements Bus {

	@Override
	public void featurs() {
		
		System.out.println("Book Your Ac Sleeper Bus Semi Sleeper , cost per km is 90");
		
	}
	public void cost()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much Km need to travel");
		
		int i = sc.nextInt();
		
		System.out.println("Tottal Fare :"+ (i *90));
	}
	

	
}
