package groomJava;

import java.util.ArrayList;

public class MergingArrayAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(34);
		al.add(323);
		
		System.out.println(al);
		
		int x[]= {4,7,8};
		
		ArrayList bl = new ArrayList<>();
		bl.add(al);
		for(int i=0;i<x.length;i++)
		{
			bl.add(x[i]);
		}
		System.out.println(bl);
	}

}
