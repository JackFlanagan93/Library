package Operational;

import Definitions.Book;

public class Runner {

	public static void main(String[] args) {

		Book b1 = new Book(001, "Book 1", 111.11, "Author 1", "Publisher 1", "Supplier1");
		Book b2 = new Book(002, "Book 2", 222.22, "Author 2", "Publisher 1", "Supplier1");
		Book b3 = new Book(003, "Book 3", 333.33, "Author 3", "Publisher 2", "Supplier2");
		Book b4 = new Book(004, "Book 4", 444.44, "Author 4", "Publisher 3", "Supplier2");
		Book b5 = new Book(005, "Book 5", 555.55, "Author 5", "Publisher 3", "Supplier2");

		b1.checkInBook();

		System.out.println(b1.toString());
	}
}