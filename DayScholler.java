package InheritDemo;

public class DayScholler extends Student {
	static double transportFee = 4500.0;

	public DayScholler() {

	}

	public DayScholler(int stdId, String stdName, double examfee, double transportFee) {
		super(stdId, stdName, examfee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() {
		return "DayScholler [transportFee=" + transportFee + ", stdId=" + stdId + ", stdName=" + stdName + ", Examfee="
				+ examfee + "]";
	}

	@Override
	double payFee() {
		double payFee = transportFee + examfee;
		return payFee;
	}

	@Override
	void Display() {
		System.out.println("Hi " + stdName);
		System.out.println("Student [stdId=" + stdId + ", stdName=" + stdName + ", Examfee=" + examfee
				+ ",TransportFee=" + transportFee + "]");
		System.out.println("total fee is : " + payFee());
		

	}

}
