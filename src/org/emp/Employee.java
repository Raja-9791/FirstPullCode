package org.emp;

public class Employee {
	public void employeeId(int id) {
		System.out.println("Employee ID:" + id);
	}
	
	public static void main (String[]args) {
		Employee e=new Employee();
		e.employeeId(89);
	}

}
