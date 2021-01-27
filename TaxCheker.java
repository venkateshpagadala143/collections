package com.ojas.Exception;

import java.util.Scanner;

public class TaxCheker {
	public static void main(String[] args) {
		System.out.println("Please Enter a Employee  name  country and salary");
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee(sc.next(), sc.next(), sc.nextDouble());
		TaxSimulator taxSim = new TaxSimulator();
		taxSim.findTaxOutput(emp);

	}

}
