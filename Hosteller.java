package InheritDemo;

public class Hosteller extends DayScholler {
	double hostelFee = 6500.0;

	public Hosteller() {

	}

	public Hosteller(int stdId, String stdName, double examfee, double hostelFee) {
		super(stdId, stdName, examfee, transportFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", transportFee=" + transportFee + ", stdId=" + stdId
				+ ", stdName=" + stdName + ", Examfee=" + examfee + "]";
	}

	@Override
	double payFee() {
		double payFee = hostelFee + examfee;
		return payFee;
	}

	@Override
	void Display() {
		System.out.println("Hi " + stdName);
		System.out.println("Student [stdId=" + stdId + ", stdName=" + stdName + ", Examfee=" + examfee
				+ ",HostelFee=" + hostelFee + "]");
		System.out.println("total fee is : " + payFee());

	}

}
