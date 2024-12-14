package part2Java;

public class Book {
	
	String name;
	String author;
	float price;
	String category;
	public Book(String name ) {
		this.name=name;
		System.out.println("Name of Book is : " + name);
		System.out.println();
	}
	public Book(String name, String author,float price ) {
		this.name=name;
		this.author=author;
		this.price=price;
		System.out.println("Name of Book is : " + name);
		System.out.println("Author of Book is : " + author);
		System.out.println("Price of this Book  : " + price);
		System.out.println();
	}

	public Book(String name, String author,float price,String category ) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.category=category;
		System.out.println("Name of Book is : " + name);
		System.out.println("Author of Book is : " + author);
		System.out.println("Price of this Book  : " + price);
		System.out.println("Book Category is : " + category);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Book b1=new Book("Ask me anything");
		Book b2=new Book("Ask me anything","Robert",4500.50f);
		Book b3=new Book("Ask me anything","Robert",4500.50f,"General Knowledge");
	}
}
