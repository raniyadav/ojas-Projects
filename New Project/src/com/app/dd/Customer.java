package com.app.dd;

public class Customer {
	private String FirstName,Lastname;
	public  Customer(){
		System.out.println("This is Default Constructor");
	}
	public Customer(String firstName, String lastname) {
		super();
		FirstName = firstName;
		Lastname = lastname;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}


}
