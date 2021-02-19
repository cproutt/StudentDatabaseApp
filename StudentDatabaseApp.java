package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.println("How many new students do you want to add?");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n = 0; n < students.length; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			students[n].showInfo();
		}
	}

}
