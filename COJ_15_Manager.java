package abstractDemo_taxCalculation;

public class COJ_15_Manager {
	int empId;
	String empName;
	double basicSalary;
	double HRAper;
	double DAper;
	double projectAllowence;

	double calculateGrossSalary() {
		return basicSalary + HRAper + DAper + projectAllowence;

	}

	public COJ_15_Manager() {

	}

	public COJ_15_Manager(int empId, String empName, double basicSalary, double hRAper, double dAper,
			double projectAllowence) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.projectAllowence = projectAllowence;
	}

	@Override
	public String toString() {
		return "COJ_15_Manager [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", HRAper="
				+ HRAper + ", DAper=" + DAper + ", projectAllowence=" + projectAllowence + "]";
	}
	

}
