package groomJava;

import java.util.Iterator;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int n=a.length+(b.length);
		int[] c=new int[n];
		
		for(int i=0 ;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(c[i] + "  ");
		}
	}

}
