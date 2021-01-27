package com.ojas.organization;

import java.util.Arrays;

public class COJ_47_Organization {
	String name;
	static int noOfEmp = 1;

	static COJ_15_Employee[] employeeList = new COJ_15_Employee[10];

	static void addEmployee(COJ_15_Employee emp) {

		System.out.println("employee lenght is :" + employeeList.length);
		System.out.println("static value" + noOfEmp);
		if (noOfEmp < 2) {
			// employeeList[noOfEmp - 1]=new COJ_15_Employee();

			employeeList[noOfEmp - 1] = emp;
			noOfEmp++;

		} else {

			for (int i = 0; i < noOfEmp - 1; i++) {
				System.out.println(" i value is" + i);
				System.out.println(employeeList[i]);
				System.out.println(Arrays.toString(employeeList));
				System.out.println("present  empId" + employeeList[i].empId);
				System.out.println("given empID " + emp.empId);

				if (employeeList[i].empId == emp.empId) {
					System.out.println("Employee Already existed please Enter another Employeee");

				} else {
					employeeList[noOfEmp - 1] = emp;
					noOfEmp++;
					break;

				}

			}
		}

	}

	static void searchEmployeeByName(String name) {
		for (int i = 0; i < noOfEmp-1; i++) {
			if (employeeList[i].empName.equals(name)) {
				System.out.println(employeeList[i]);
				break;

			}
			
			}

		}

	

	static void searchEmployeeById(int id) {
		for (int i = 0; i < noOfEmp-1; i++) {
			if (employeeList[i].empId == id) {
				System.out.println(employeeList[i]);
				break;
			}
		}
	}

	static void deleteEmployeeById(int id) {
		for (int i = 0; i <noOfEmp-1; i++) {
			if (employeeList[i].empId == id) {
				COJ_15_Employee temp = employeeList[i];
				employeeList[i] = employeeList[noOfEmp - 2];
				employeeList[noOfEmp-1] = null;
				noOfEmp--;
				System.out.println(noOfEmp);

				break;
			}

		}
	}
}
