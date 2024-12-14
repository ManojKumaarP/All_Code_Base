package pgmJava;


import java.util.Scanner;

class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		String s=sc.next(),temp="";
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count =0;
			if(temp.indexOf(ch)==-1)
			{
				for(int j=0;j<s.length();j++)
				{
					if(ch==s.charAt(i))
						count++;
					}
				temp+=ch;
			}
			
		}
		System.out.println(temp);
			
	}

}
