package com.ojas.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreEmployeeInfo {

	static int number = 1;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		while (true) {
			System.out.println("Please Select an option");
			System.out.println("1.AddEmployee");
			System.out.println("2.Search an Employee");
			System.out.println("3.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please Enter EmpID  EmpName EmpSalary ");
				emp.setEmpId(sc.nextInt());
				emp.setEmpName(sc.next());
				emp.setSalary(sc.nextDouble());
				storeEmpInfo(emp);
				break;

			case 2:

				seachAnEmployee();
				break;
			case 3:
				System.out.println("Thank you" + "\n" + "Your Session Has Been Compleated");
				System.exit(3);
				System.exit(3);

			}
		}

	}

	private static void seachAnEmployee() throws IOException {
		FileReader fr = new FileReader("E:/Praveen/Employee1.txt");
		BufferedReader bf = new BufferedReader(fr);
		Employee[] emps = new Employee[number];
		String line;
		int num = 0;
		while ((line = bf.readLine()) != null) {
			String str[] = line.split(",");
			Employee emp = new Employee(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
			emps[num] = emp;

			number++;
		}
		System.out.println("Enter an Employee Id");
		Scanner sc = new Scanner(System.in);
		int empid = sc.nextInt();
		number = number - 2;
		System.out.println(number + 1);
		for (Employee employee : emps) {
			if (employee.empId == empid) {
				System.out.println(employee.getEmpId() + "," + employee.getEmpName() + "," + employee.getSalary());
				number = 1;
				break;
			}
		}
		System.out.println("please Enter a valid  EmpId");
		number = 1;

	}

	private static void storeEmpInfo(Employee emp) throws IOException {
		String res = emp.getEmpId() + "," + emp.getEmpName() + "," + emp.getSalary();
		FileWriter fw = new FileWriter("E:/Praveen/Employee1.txt", true);
		fw.write("\r\n" + res);
		fw.flush();
		fw.close();

	}
}
