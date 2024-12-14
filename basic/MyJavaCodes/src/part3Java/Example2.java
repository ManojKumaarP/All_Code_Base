package part3Java;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t=new TreeSet<>();
		
		t.add(10);
		t.add(30);
		t.add(45);
		t.add(50);
		t.add(100);
		t.add(68);
		System.out.println(t);
		for(int i :t)
		{
			
			if(i==100)
			{
				char j=(char)i;
				System.out.println(j);
			}
		}
	}

}
