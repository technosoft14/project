package org.emp.details;

public class Employess {

	public static void main(String[] args) {
		Employess obj = new Employess();
		obj.empName(87);
	}
	
	public void empName(int a) {
		System.out.println("parent class");

	}
	public void empName(byte f) {
		System.out.println("Employee name is Chandru when passed id");

	}
	public void empName(int d, int e, int f) {
		System.out.println("Employee name is Chandru when passed phoneNum");

	}
	public void empName(int b, String c) {
		System.out.println("Employee name is Chandru when passed int and string");

	}
	public void empName(String c, int b) {
		System.out.println("Employee name is Chandru when passed string and int");

	}
	
	

}
