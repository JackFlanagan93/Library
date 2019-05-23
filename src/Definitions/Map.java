package Definitions;

public class Map extends Items {

	private String area;
	private double revision;
	private String type;

	public Map(int id, String name, double price, String area, double revision, String type) {

		super(id, name, price);

		this.area = area;
		this.revision = revision;
		this.type = type;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getRevision() {
		return revision;
	}

	public void setRevision(double revision) {
		this.revision = revision;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
