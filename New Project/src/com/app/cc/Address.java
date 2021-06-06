package com.app.cc;

public class Address {
private String hno;
private String colName;
private String cityName;

public String toString() {
	return "Address [hno=" + hno + ", colName=" + colName + ", cityName="
			+ cityName + "]";
}

public Address(String hno2, String colName, String cityName) {
	super();
	this.hno = hno2;
	this.colName = colName;
	this.cityName = cityName;
}



	}

