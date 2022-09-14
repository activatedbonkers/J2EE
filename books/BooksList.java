package books;

import java.util.*;

public class BooksList {
	public static ArrayList<Book> bList = new ArrayList<Book>();
	public static void addBook(Book b) {
		bList.add(b);
	}

	public static void sortBooks() {
		ArrayList<Book> sortedList = new ArrayList<Book>(bList);
		Collections.sort(sortedList, new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				if(b1.price > b2.price) {
					return 1;
				}
				else if(b1.price == b2.price) {
					return 0;
				}
				else {
					return -1;
				}
			}
		});
		System.out.println("Sorted list of books : ");
		for(Book b : sortedList) {
			System.out.println(b);
		}
	}
	
	public static void getBooksByAuthor(String author) {
		ArrayList<Book> list = new ArrayList<Book>();
		for(Book b : bList) {
			if(b.author.equals(author)) {
				list.add(b);
			}
		}
		for(Book b : list) {
			System.out.println(b);
		}
	}
	
	public static void getBooksMoreThanPrice(double price) {
		ArrayList<Book> list = new ArrayList<Book>();
		for(Book b : bList) {
			if(b.price > price) {
				list.add(b);
			}
		}
		for(Book b : list) {
			System.out.println(b);
		}
	}
	
	
	}
