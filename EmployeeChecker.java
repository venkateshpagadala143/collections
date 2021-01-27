package InheritenceDemo3;

import java.util.Scanner;

public class EmployeeChecker extends Cleark {

	public static void main(String[] args) {
		System.out.println("Please Enter your ID  Name  Salary");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		String empName = sc.next();
		Double empSalary = sc.nextDouble();

		System.out.println("please Select your Designation" + "\n" + "1.Manager" + "\n" + "2.clerk");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Please Select your Position+" + "\n" + "1.HR" + "\n" + "SALES");
			int postion = sc.nextInt();
			Manager man = new Manager(empId, empName, empSalary, ManagerType.HR);
			getSalary(postion);
			break;

		case 2:
			System.out.println("Enter Your Typing Speed  And Accurency");
			speed = sc.nextInt();
			accurency = sc.nextInt();
			Cleark clr = new Cleark(empId, empName, empSalary);
			getSalary(speed, accurency);
			break;

		}

	}

}
