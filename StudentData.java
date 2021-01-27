package com.ojas;

import java.util.Scanner;

public class StudentData {
	int sid;
	String sname;
	int marks1, marks2, marks3, marks4, marks5;

	StudentData(int sid, String sname, int marks1, int marks2, int marks3, int marks4, int marks5) {
		this.sid = sid;
		this.sname = sname;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
		this.marks5 = marks5;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		StudentData std[] = new StudentData[size];
		for (int insert = 0; insert < std.length; insert++) {
			System.out.println("Enter  " + (insert + 1 )+ " Student records here");
			std[insert] = new StudentData(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt(), sc.nextInt());
		}
		int sumofMarks[] = findTotalMarksOfStudents(std);
		findAVgeragemarks(sumofMarks, std);
	}

	private static void findAVgeragemarks(int[] sumofMarks, StudentData[] std) {
		for (int check = 0; check < sumofMarks.length; check++) {
			int avg = sumofMarks[check] / 5;
			if (avg == 0) {
				System.out.println(std[check].sname + " : is failed please try again");
			} else if (avg >= 75) {
				System.out.println(std[check].sname + " : you got distinaion");
			} else if (avg >= 65) {
				System.out.println(std[check].sname + " : you got an first class");
			} else if (avg >= 50) {
				System.out.println(std[check].sname + " : you got an second class");
			}
		}

	}

	private static int[] findTotalMarksOfStudents(StudentData[] std) {
		int sum[] = new int[std.length];
		for (int index = 0; index < std.length; index++) {
			if (std[index].marks1 < 35 || std[index].marks2 < 35 || std[index].marks3 < 35 || std[index].marks4 < 35
					|| std[index].marks5 < 35) {

			} else {
				sum[index] = std[index].marks1 + std[index].marks2 + std[index].marks3 + std[index].marks4
						+ std[index].marks5;
			}
		}
		return sum;

	}

}
