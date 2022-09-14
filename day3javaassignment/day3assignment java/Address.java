package com.sonata.day3assignment;

public class Address {
	int doorNo,pinCode;
	String street,city;
	Address () {}
	Address (int dr , String st , String cty , int pcode) {
		this.doorNo = dr;
		this.street = st;
		this.city = cty;
		this.pinCode = pcode;
	}
	public String toString() {
		return doorNo+", "+street+", "+city+" - "+pinCode;
	}
}