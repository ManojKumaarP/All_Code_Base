package practice;

public class InitializingClass {

	String color ;
	int height ;
	int weight ;
	public InitializingClass(String color,int height,int weight) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.height=height;
		this.weight=weight;		
	}
	public void dispay() {
		System.out.println(color + " " + height + " " + weight);
	}
}
