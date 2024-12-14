package part2Java;
public class Inc {
	public static void main(String[] args) {
	
		int n=5375;
		System.out.println("Actual value of n is :"+n);
		int	fl=n%10 ,//5 - removed the last digit to avoid confusions
			m=0,c=1;
			n=n/10;//537 -only first and middle number are present 
			System.out.println("Current value of n is "+ n);
			System.out.println("Loop starts here");
			System.out.println();
			
		while(n!=0)
		{
			System.out.println("Iteration :" +c);
			System.out.println("N value "+ n);
			int l=n%10;
			System.out.println("L value " + l);
			if(n<=9)
				{
				fl=fl+l;// It is the first digit
				System.out.println("Fl value "+fl);}
			else
				{
				m=m+l;// Middle number
				System.out.println("M value "+m);
				}
			
			n/=10;//removing last digit
			System.out.println();
			c++;
		}
		//Comparing the sum of fl and mid numbers.
		if(fl==m)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
				
		}
	}


