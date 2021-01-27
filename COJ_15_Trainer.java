package abstractDemo_taxCalculation;

public class COJ_15_Trainer {
	int empId;
	String empName;
	double basicSalary;
	double HRAper;
	double DAper;
	int batchCount;
	double perkperBatch;
	double calculateGrossSalary(){
		return basicSalary+HRAper+DAper+(batchCount*perkperBatch);
		
	}
	public COJ_15_Trainer() {
		
	}
	public COJ_15_Trainer(int empId, String empName, double basicSalary, double hRAper, double dAper, int batchCount,
			double perkperBatch) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.batchCount = batchCount;
		this.perkperBatch = perkperBatch;
	}
	@Override
	public String toString() {
		return "COJ_15_Trainer [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", HRAper="
				+ HRAper + ", DAper=" + DAper + ", batchCount=" + batchCount + ", perkperBatch=" + perkperBatch + "]";
	}
	

}
