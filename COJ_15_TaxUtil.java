package abstractDemo_taxCalculation;

import java.util.Scanner;

public class COJ_15_TaxUtil {
	public double calculateTaxEmployee(Scanner sc, double grossSalary) {
		double taxAmount;

		if (grossSalary > 30000.0) {
			taxAmount = 0.2 * grossSalary;
		} else {
			taxAmount = 0.05 * grossSalary;
		}

		return taxAmount;

	}

	double calculateTaxManager(Scanner sc, double grossSalary) {
		double taxAmount;

		if (grossSalary > 30000.0) {
			taxAmount = 0.2 * grossSalary;
		} else {
			taxAmount = 0.05 * grossSalary;
		}

		return taxAmount;



	}

	double calculateTaxTrainer(Scanner sc,double grossSalary) {
		double taxAmount;

		if (grossSalary > 30000.0) {
			taxAmount = 0.2 * grossSalary;
		} else {
			taxAmount = 0.05 * grossSalary;
		}

		return taxAmount;

	}

	double calculateTaxSourcing(Scanner sc,double grossSalary) {
		double taxAmount;

		if (grossSalary > 30000.0) {
			taxAmount = 0.2 * grossSalary;
		} else {
			taxAmount = 0.05 * grossSalary;
		}

		return taxAmount;

	}

}
