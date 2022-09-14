package com.sonata.day3assignment.firstQuestion;

public class Tester extends Employee {
	double yearlySal;
	Tester() {}
	Tester(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public double salCal(int empSal) {
		testerSal =empSal*20;
		return testerSal ;
		
	}
	public void  display() {
		System.out.println("emplyoo id"+empId+"name"+empName);
		System.out.println("Salary of tester"+testerSal);
	}

}