package _13_01_2021_oops;

public class Address {

	private String state;
	private String country;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	 
	public Address(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return String.format("%-15s %s\n", state,country);
	}
	
}
