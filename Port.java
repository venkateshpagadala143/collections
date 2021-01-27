package _13_01_2021_oops;

public class Port {
	private int id;
	private String name;
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Port(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public Port(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {

		return String.format("%-15s %-15s %-15s", id, name, country);

	}
}
