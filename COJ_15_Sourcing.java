package abstractDemo_taxCalculation;

public class COJ_15_Sourcing {
	int empId;
	String empName;
	double basicSalary;
	double HRAper;
	double DAper;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;

	double calculateGrossSalary() {
		return basicSalary + HRAper + DAper + (((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment);

	}

	public COJ_15_Sourcing() {

	}

	public COJ_15_Sourcing(int empId, String empName, double basicSalary, double hRAper, double dAper,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	@Override
	public String toString() {
		return "COJ_15_Sourcing [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", HRAper="
				+ HRAper + ", DAper=" + DAper + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached="
				+ enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	

}
