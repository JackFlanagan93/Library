package Definitions;

public class Customers extends People {

	private String address;
	private String email;
	private String accessCode;

	public Customers(int id, String name, int age, String address, String email, String accessCode) {

		super(id, name, age);

		this.address = address;
		this.email = email;
		this.accessCode = accessCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

}
