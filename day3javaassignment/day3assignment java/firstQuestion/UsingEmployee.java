package com.sonata.day3assignment.firstQuestion;

public class UsingEmployee {

	public static void main(String[] args) {
		Manager m1 = new Manager(12345, "Manager Name", 999);
		Developer d1 = new Developer(110, "Rohini", 150);
		Tester t1 = new Tester(54321, "Tester Name", 550);
		m1.display();
		d1.display();
		t1.display();
	}
}