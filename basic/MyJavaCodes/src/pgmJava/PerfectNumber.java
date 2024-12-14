package pgmJava;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n % i == 0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println(n+ " Is a perfect number");
		else
			System.out.println(n +" is not a perfect number");
	}

}
