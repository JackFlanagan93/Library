package Definitions;

import Operational.Readable;

public class Book extends Items implements Readable {

	private String author;
	private String publisher;
	private String supplier;
	private boolean restricted;

	public Book(int id, String name, double price, String author, String publisher, String supplier) {

		super(id, name, price);

		this.author = author;
		this.publisher = publisher;
		this.supplier = supplier;
	}

	public Book(int id, String name, double price, String author, String publisher, String supplier,
			boolean restricted) {

		super(id, name, price);

		this.author = author;
		this.publisher = publisher;
		this.supplier = supplier;
		this.restricted = restricted;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public boolean getRestricted() {
		return restricted;
	}

	public void setRestricted(boolean restricted) {
		this.restricted = restricted;
	}

	public String outputToConsole() {
		return "Author: " + author + "Publisher: " + publisher + "Supplier: " + supplier + "Restricted: " + restricted;
	}
}
