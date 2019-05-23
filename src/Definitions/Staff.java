package Definitions;

public class Staff extends People {

	private String jobTitle;
	private double salary;
	private String department;

	public Staff(int id, String name, int age, String jobTitle, double salary, String department) {

		super(id, name, age);

		this.jobTitle = jobTitle;
		this.salary = salary;
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
