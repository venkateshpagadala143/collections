package com.ojas.organization;

public class COJ_15_Employee {
	int empId;
	String empName;
	double basicSalary;
	double HRAper;
	double DAper;

	public COJ_15_Employee(int empId, String empName, double basicSalary, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.HRAper = hra;
		this.DAper = da;
	}

	public COJ_15_Employee() {
		empId = 0;
		empName = null;
		basicSalary = 0.0;
		HRAper = 0.0;
		DAper = 0.0;

	}

	double calculateGrossSalary() {
		return basicSalary + HRAper + DAper;

	}

	@Override
	public String toString() {
		return "COJ_15_Employee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", HRAper="
				+ HRAper + ", DAper=" + DAper + "]";
	}

}
