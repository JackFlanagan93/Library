package Definitions;

public class GovernmentDocuments extends Items {

	private String author;
	private String description;
	private String department;

	public GovernmentDocuments(int id, String name, double price, String author, String description,
			String department) {

		super(id, name, price);
		this.author = author;
		this.description = description;
		this.department = department;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
