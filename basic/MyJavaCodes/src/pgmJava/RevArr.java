package pgmJava;

public class RevArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {56,34,45,66};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i],rev=0;
			while(n>0)
			{
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			System.out.print(rev+"  ");
		}
		
		
	}

}
