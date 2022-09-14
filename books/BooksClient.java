package books;
import java.util.*;

public class BooksClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, i = 1;
		String title, author, publisher, id;
		double price;
		while(i == 1) {
			System.out.println("Enter 1 : To add a book");
			System.out.println("Enter 2 : To sort the books");
			System.out.println("Enter 3 : To get books by an author");
			System.out.println("Enter 4 : To get books more than a price");
			System.out.println("Enter 5 : To exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter book title, author, publisher, id, price");
					title = sc.next();
					author = sc.next();
					publisher = sc.next();
					id = sc.next();
					price = sc.nextDouble();
					BooksList.addBook(new Book(title, author, publisher, id, price));
					System.out.println("Book added");
					break;
			case 2: BooksList.sortBooks();
					break;
			case 3: System.out.println("Enter author");
					author = sc.next();
					BooksList.getBooksByAuthor(author);
					break;
			case 4: System.out.println("Enter a price");
					price = sc.nextDouble();
					BooksList.getBooksMoreThanPrice(price);
					break;
			case 5: i = 0;
					break;
			default: System.out.println("Entered wrong choice");
					break;
			}
		}
		sc.close();
	}
}