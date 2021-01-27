package oopsprograms;

public class Agent {
	private String id;
	private String name;
	private String address;

	public Agent(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getFmcCode() {
		return id;
	}

	public void setFmcCode(String fmcCode) {
		this.id = fmcCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
