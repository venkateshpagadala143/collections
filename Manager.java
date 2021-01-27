package InheritenceDemo3;

enum ManagerType {
	HR, SALES;
}

public class Manager extends Employee {
	static ManagerType mt;

	public Manager() {

	}

	public Manager(int empId, String empName, double empSalary, ManagerType mt) {
		super(empId, empName, empSalary);
		this.mt = mt;
	}

	static void getSalary(int option) {

		if (option == 1) {
			double sal = empSalary + 10000;
			System.out.println("previous Salary is : " + empSalary);
			System.out.println("updated Salary is :" + sal);
			Manager man = new Manager(empId, empName, sal, ManagerType.HR);
			System.out.println(man);

		} else if (option == 2) {
			double sal = empSalary + 5000;
			System.out.println("previous Salary is : " + empSalary);
			System.out.println("updated Salary is :" + sal);
			Manager man = new Manager(empId, empName, sal, ManagerType.SALES);
			System.out.println(man);

		}

	}

	@Override
	public String toString() {
		return "Manager [ManagerType=" + mt + ", EmpId=" + getEmpId() + ", EmpName=" + getEmpName() + ",EmpSalary="
				+ getEmpSalary() + "]";
	}

}
