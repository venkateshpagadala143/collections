package com.ojas.organization;

import java.util.Scanner;

public class StringHandling {
	// private static final int MAX_VALUE = 0;

	public static void main(String[] args) {
		COJ_47_Organization orgn = new COJ_47_Organization();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("please Select option");
			System.out.println("1.ADD Employee");
			System.out.println("2.Search Employee By Name");
			System.out.println("3.Search Employee By ID");
			System.out.println("4.Delete Employee");
			System.out.println("5.Quit");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				for (int i = 1; i <= 10; i++) {
					System.out.println("1.ADD Employee" + "\n" + "2.Quit");
					int option1 = sc.nextInt();
					if (option1 == 1) {
						System.out.println("ADD Employee Id   Name   BasicSalary  HRA  And  DA");
						COJ_15_Employee emp = new COJ_15_Employee(sc.nextInt(), sc.next(), sc.nextDouble(),
								sc.nextDouble(), sc.nextDouble());
						System.out.println("in string HAndling" + emp);
						COJ_47_Organization.addEmployee(emp);

					} else if (option1 == 2) {
						break;
					}

				}
				break;

			case 2:
				System.out.println("please Search Employee By Using EmpName");
				String name = sc.next();
				COJ_47_Organization.searchEmployeeByName(name);
				break;

			case 3:
				System.out.println("Please Search Employee By Using EMpId ");
				int id = sc.nextInt();
				COJ_47_Organization.searchEmployeeById(id);
				break;
			case 4:
				System.out.println("please Deleate Employee By USing Id ");
				int empId=sc.nextInt();
				COJ_47_Organization.deleteEmployeeById(empId);
				break;

			case 5:
				System.out.println("thank you ");
				System.exit(5);

			}

		}

	}

}
