package abstractDemo_taxCalculation;

import java.util.Scanner;

public class COJ_15_Constractor {
	public static void main(String[] args) {
		COJ_15_TaxUtil tax = new COJ_15_TaxUtil();

		Scanner sc = new Scanner(System.in);
		System.out.println("please Select One option");
		System.out.println("1.Employee");
		System.out.println("2.Manager");
		System.out.println("3.Trainee");
		System.out.println("4.Sourcing");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("please enter your Id  Name  basicsalary  HRA   DA ");
			COJ_15_Employee employee = new COJ_15_Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble());
			double grossSalary = employee.calculateGrossSalary();
			double tax1 = tax.calculateTaxEmployee(sc, employee.calculateGrossSalary());
			System.out.println("Gross Salary will be   : " + employee.calculateGrossSalary());
			System.out.println("The tax Amount will be : " + tax1);
			System.out.println(employee);
			break;

		case 2:
			System.out.println("please enter your Id  Name  basicsalary  HRA   DA  ProjectAllowence");
			COJ_15_Manager manager = new COJ_15_Manager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),
					sc.nextDouble(), sc.nextDouble());
			double grossSalary1 = manager.calculateGrossSalary();
			double tax2 = tax.calculateTaxManager(sc, manager.calculateGrossSalary());
			System.out.println("Gross Salary will be   : " + manager.calculateGrossSalary());
			System.out.println("The tax Amount will be : " + tax2);
			System.out.println(manager);
			break;

		case 3:
			System.out.println("please enter your Id  Name  basicsalary  HRA   DA  batchCount  perkPerBench ");
			COJ_15_Trainer trianer = new COJ_15_Trainer(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble(), sc.nextInt(), sc.nextDouble());
			double grossSalary2 = trianer.calculateGrossSalary();
			double tax3 = tax.calculateTaxManager(sc, trianer.calculateGrossSalary());
			System.out.println("Gross Salary will be   : " + trianer.calculateGrossSalary());
			System.out.println("The tax Amount will be : " + tax3);
			System.out.println(trianer);
			break;
		case 4:
			System.out.println(
					"please enter your Id  Name  basicsalary  HRA   DA Enrollmentreched  Enrollmenttarget perkPerEnrollment");
			COJ_15_Sourcing sourcing = new COJ_15_Sourcing(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
			double grossSalary3 = sourcing.calculateGrossSalary();
			double tax4 = tax.calculateTaxManager(sc, sourcing.calculateGrossSalary());
			System.out.println("Gross Salary will be   : " + sourcing.calculateGrossSalary());
			System.out.println("The tax Amount will be : " + tax4);
			System.out.println(sourcing);
			break;

		}
	}

}
