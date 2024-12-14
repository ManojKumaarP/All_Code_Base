package part3Java;

import java.util.HashMap;

public class HMxample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Object> hm=new HashMap<>();
		hm.put("Name", "Manoj");
		hm.put("Lname","Jonam");
		hm.put("Age",25);
		
		//System.out.println(hm);
		
		for(String i : hm.keySet())
			System.out.println(hm.get(i));
	}



}
