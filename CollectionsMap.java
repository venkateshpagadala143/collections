package _01_04_2021_collections;

import java.util.Scanner;

public class CollectionsMap {

	public static void main(String[] args) {
		MapOperations mapOp = new MapOperations();
		Scanner sc = new Scanner(System.in);
		while (true) {
			mapOp.menuDrivenMap();
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please Enter EmpId   EmpName and EmpDesign");
				mapOp.addEmployee(new Employee(sc.nextInt(), sc.next(), sc.next()));
				break;
			case 2:
				System.out.println("Please Enter EmpId");
				int empId = sc.nextInt();
				mapOp.removeEmployee(empId);
				break;
			case 3:
				System.out.println("Please Enter EmpId");
				int emplId = sc.nextInt();
				mapOp.FindEmployee(emplId);

				break;
			case 4:
				mapOp.getEmployeeList();
				
				break;
			case 5:
				System.exit(0);

			default:
				System.out.println("Please Chose Valid Option");
				break;
			}
		}

	}
}
