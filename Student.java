package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentId;
	private String courses = "";
	private int balance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Freshman \n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter grade level: ");
		this.year = in.nextInt();
				
		setStudentId();
	}
	
	// Create user 5 digit Student id with first number being grade level
	private void setStudentId() {
		id++;
		studentId = year + "" + id; 
	}
	
	// Set course lists, each course costs $600
	public void enroll() {
		do{
			System.out.println("Enter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				balance = balance + courseCost;
			} else {
				break;
			}
		} while(1 != 0);
		
	}
	
	// View Balance
	public void getBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	// Pay Tuition
	public void payTuition() {
		System.out.println("How much will you be paying towards " + balance + "?");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for your payment of " + payment);
		getBalance();
	}
	
	// See full info
	public void showInfo(){
		System.out.print(
		"STUDENT NAME: " + this.firstName + " " + this.lastName + "\n" +
		"GRADE LEVEL: " + this.year + "\n" +
		"STUDENT ID: " + this.studentId + "\n" +
		"COURSES: " + courses + "\n" +
		"BALANCE: " + balance + "\n");
	}
	
	
}
