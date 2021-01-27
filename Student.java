package com.ojas;

import java.util.Scanner;

public class Student {
	int stdId;
	String stdName;
	Address address;
	Courses course;

	Student(int stdId, String stdName, Address address) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;

	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + " " + address + "  " + course + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please Enter your Details" + "\n");
		System.out.print("stdId = ");
		int stdId = sc.nextInt();
		System.out.print("stdName = ");
		String stdName = sc.next();
		System.out.print("Enter H-no = ");
		String hNo = sc.next();
		System.out.print("Entercolony name = ");
		String colName = sc.next();
		System.out.print("Enter distic = ");
		String distic = sc.next();
		Address add = new Address(hNo, colName, distic);
		System.err.println("Available Courses are :");
		Courses cour = new Courses();

		for (int i = 0; i < cour.course.length; i++) {
			System.out.println(cour.course[i]);

		}

		System.out.println("Please enter number which course you want ");

		int coursenum[] = new int[cour.course.length];
		for (int i = 0; i < coursenum.length; i++) {
			coursenum[i] = sc.nextInt();
			if (coursenum[i] == 7) {
				break;
			}

		}
		String res = "";
		int amount = 0;
		for (int index = 0; index < coursenum.length; index++) {

			for (int check = 1; check < cour.prises.length; check++) {

				if (coursenum[index] == check) {
					amount += cour.prises[check - 1];
					res += cour.course[check - 1] + ",";

				}

			}
		}

		Student std = new Student(stdId, stdName, add);

		System.out.println(std);
		System.out.println("your selected courses are");
		System.out.println(res);
		System.out.println("Amount is :" + amount);

	}

}
