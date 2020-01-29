package org.company;

import Day1.EmployeeDetails;

public class Company {
	public void companyName() {
		System.out.println("Comp name is XXX");
		
	}

	public static void main(String[] args) {
		Company c=new Company();
		c.companyName();
		EmployeeDetails e=new EmployeeDetails();
		e.empDob();
		e.empId();
		e.empName();
		e.empPhone();
	}
	
}
