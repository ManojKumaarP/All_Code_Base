package part2Java;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=25;
		System.out.println("Im Int "+ number);//Widening
		
		float n2=number;
		System.out.println("Im Float " +n2);
		
		double n3=n2;
		System.out.println("Im Double " +n3);
		System.out.println();
		
		float a=25.5f;//narrowing
		
		byte b=(byte)a;
		System.out.println("Im byte "+ b);
		
		float a1=25.5f;
		int b1=(int)a1;
		System.out.println("Im Int "+ b1);
		
		float a2=25.5f;
		short b3=(short)a2;
		System.out.println("Im Short "+ b3);
	}

}
