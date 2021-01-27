package com.ojas.Exception;

public class TaxCalculator {

	double tax;

	double calculateTax(Employee emp) {
		if (!emp.country.equals("Indian")) {

			return 1;

		} else if (emp.empName.isEmpty() || emp.empName.equals(null)) {

			return 2;

		} else if (emp.salary > 100000) {
			tax = (emp.salary * 8) / 100;

		} else if (emp.salary > 50000) {
			tax = (emp.salary * 6) / 100;

		} else if (emp.salary > 30000) {
			tax = (emp.salary * 5) / 100;

		} else if (emp.salary > 10000) {

			tax = (emp.salary * 4) / 100;

		} else {

			return 3;
		}
		return tax;

	}

}
