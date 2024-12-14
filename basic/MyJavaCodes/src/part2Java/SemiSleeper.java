package part2Java;

import java.util.Scanner;

public class SemiSleeper implements Bus {

	@Override
	public void featurs() {
		// TODO Auto-generated method stub
		System.out.println("Book Your Semi Sleeper Bus");
		System.out.println("Cost per Km is 50 Rs");
	}

	public void cost()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much Km need to travel");
		int i = sc.nextInt();
		System.out.println("Tottal Fare :"+ (i *50));
	}
}
