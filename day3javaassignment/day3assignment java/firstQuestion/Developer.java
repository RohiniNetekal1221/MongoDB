package com.sonata.day3assignment.firstQuestion;

public class Developer extends Employee {
	double yearlySal;
	Developer() {}
	Developer(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public double devSalary() {
		devSal =empSal*10;
		return devSal ;
	}
	public void  disDev() {
		System.out.println("emplyoo id"+empId+"name"+empName);
		System.out.println("Salary of Devloper"+devSal);
	}
}