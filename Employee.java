package _29_12_02020_IOStream;

public class Employee {
	private int empId;
	private String empName;
	private String empDesignation;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(int empId, String empName, String empDesignation, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
public Employee() {
	
}
@Override
public String toString() {
	return "empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + ", empSalary="
			+ empSalary + "";
}

}
