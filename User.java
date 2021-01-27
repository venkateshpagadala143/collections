package com.ojas.IOStream;

public class User {
String useName;
String phoneNumber;

public String getUseName() {
	return useName;
}
public void setUseName(String useName) {
	this.useName = useName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public User(String useName, String phoneNumber) {
	super();
	this.useName = useName;
	this.phoneNumber = phoneNumber;
}
	public User() {
		
	}
}
