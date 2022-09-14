package com.sonata.day3assignment;

public class UsingPeople {

	public static void main(String[] args) {
		
		
		TechnicalEmployee t1 = new TechnicalEmployee(22859, "Rohini", "python", 55000, 6);
		Address tAdd = new Address(16, "N.R colony", "Bengaluru", 560074);
		t1.address = tAdd;
		
		
		Staff s1 = new Staff(12345, "Staff Name", "Staff Title", 12000, 2);
		Address sAdd = new Address(16, "BTM", "Bengaluru", 560074);
		s1.address = sAdd;
		
		
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}