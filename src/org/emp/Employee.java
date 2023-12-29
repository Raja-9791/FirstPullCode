package org.emp;

public class Employee {
	public void employeeId(int id) {
		System.out.println("Employee ID:" + id);
		System.out.println("Work done by QA");
		System.out.println("Code is running fine in Local");
	}
	
	public static void main (String[]args) {
		Employee e=new Employee();
		e.employeeId(89);
	}

}
