package Definitions;

import Operational.crud;

public class Book extends Items implements crud {

	private String author;
	private String publisher;
	private String supplier;

	public Book(int id, String name, double price, String author, String publisher, String supplier) {

		super(id, name, price);

		this.author = author;
		this.publisher = publisher;
		this.supplier = supplier;
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

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

}
