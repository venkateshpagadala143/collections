package com.ojas;

public class Address {
	String Hno;
	String colName;
	String distic;

	Address(String Hno, String colName, String distic) {
		this.Hno=Hno;
		this.colName=colName;
		this.distic=distic;

	}

	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", colName=" + colName + ", distic=" + distic + "]";
	}
	
}
