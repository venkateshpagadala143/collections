package com.ojas;

import java.util.Scanner;

public class GetStudentDataUsingAccessModifier {
	public int stdid;
	public String stdName;
	private int marks;
	private char grade;

	public void displayDetails() {
		System.out.println("[Name=" + stdName + ", StudentId=" + stdid + ", Marks=" + marks + ", grade=" + grade + "]");

	}

	private void calculateGrade(int marks) {
		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80) {
			grade = 'B';
		} else if (marks > 70) {
			grade = 'C';
		} else if (marks > 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}
	}

	GetStudentDataUsingAccessModifier(int stdid, String stdName, int marks) {
		this.stdid = stdid;
		this.stdName = stdName;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number how many records you want to Enter");
		int size = sc.nextInt();
		GetStudentDataUsingAccessModifier std[] = new GetStudentDataUsingAccessModifier[size];
		for (int index = 0; index < std.length; index++) {
			System.out.println("Enter "+(index+1)+"records here");

			std[index] = new GetStudentDataUsingAccessModifier(sc.nextInt(), sc.next(), sc.nextInt());
		}
		for (int check = 0; check < std.length; check++) {
			std[check].calculateGrade(std[check].marks);
			std[check].displayDetails();

		}

	}

}
