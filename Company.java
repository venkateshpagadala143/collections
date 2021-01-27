package _13_01_2021_oops;

public class Company {
private String identifier;
private String iata;
private String fmc;
private Address address;
public String getIdenrifier() {
	return identifier;
}
public void setIdenrifier(String identifier) {
	this.identifier = identifier;
}
public String getIata() {
	return iata;
}
public void setIata(String iata) {
	this.iata = iata;
}
public String getFmc() {
	return fmc;
}
public void setFmc(String fmc) {
	this.fmc = fmc;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Company() {
	
}
public Company(String identifier, String iata, String fmc, Address address) {
	super();
	this.identifier = identifier;
	this.iata = iata;
	this.fmc = fmc;
	this.address = address;
}
@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %s" ,identifier,iata,fmc,address);
}

}
