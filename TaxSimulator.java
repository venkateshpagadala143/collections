package com.ojas.Exception;

public class TaxSimulator {
	TaxCalculator taxcal=new TaxCalculator();
	void findTaxOutput(Employee emp){
		double output = taxcal.calculateTax(emp);
		if(output==1) {
			try {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		} catch (CountryNotValidException e) {

			System.out.println(e.getMessage());
		}
		}else if(output==2) {
			try {
			throw new NameNotValidException("The employee name cannot be null or empty");
		} catch (NameNotValidException e) {
			System.out.println(e.getMessage());
		}
		}else if(output==3) {
			try {
			throw new NotEligibleForTaxException("The employee does not need to pay tax");
		} catch (NotEligibleForTaxException e) {

			System.out.println(e.getMessage());
		}
			
		}else {
			System.out.println("The tax Amount is :"+taxcal.tax);
		}
		
		
	}

}
