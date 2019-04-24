package org.emp.details;

import java.util.Scanner;

public class EmployeeDetails {




	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee id");
		int id = input.nextInt();
		System.out.println("Enter ID Number " +id);
		System.out.println("Enter Employee name");
		String name = input.next();
		System.out.println("Enter Name" +name);
		System.out.println("Enter Employee phone");
		long phone = input.nextLong();
		System.out.println("Enter Phone" +phone);


	}
}
