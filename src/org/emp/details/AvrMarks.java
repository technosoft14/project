package org.emp.details;

import java.util.Scanner;

public class AvrMarks {
	public static void main(String[] args) {
		
		Scanner avg = new Scanner(System.in);
		System.out.println(" Enter Student ID");
		int studentId= avg.nextInt();
		System.out.println("StudentID" +studentId);
		System.out.println("Please Enter Student Name");
		String studentName  = avg.next();
		System.out.println("StudentName" +studentName);
		System.out.println("Enter Mark1");
		int mark1 = avg.nextInt();
		System.out.println("Mark1 " +mark1);
		System.out.println("Enter Mark2");
		int mark2 = avg.nextInt();
		System.out.println("Mark2 " +mark2);
		float avg1 = (mark1+mark2)/2;
		System.out.println("Total marks :" +avg1);
		System.out.println("enter char num");
		
		char ch = avg.next().charAt(3);
		System.out.println(ch);
			
			
	}

}
