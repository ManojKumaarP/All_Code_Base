package groomJava;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		int a[]= {45,79,90};
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
		Object[] arr=al.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
