package books;

public class Book {
	String title, author, publisher, id;
	double price;

	public Book(String title, String author, String publisher, String id, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.id = id;
		this.price = price;
	}
	
	public String toString() {
		return "ID : "+this.id+" Title: "+this.title+" Author : "+this.author+" Publisher : "+this.publisher+" Price : "+String.valueOf(this.price);
	}
}
