package InheritDemo;

public class Student {
	int stdId;
	String stdName;
	static double examfee=2400.0;

	public Student(int stdId, String stdName, double examfee) {
		this.stdId = stdId;
		this.stdName = stdName;
		Student.examfee = examfee;
	}

	void  Display() {

	System.out.println("Student [stdId=" + stdId + ", stdName=" + stdName + ", Examfee=" + examfee + "]");

	}

	double payFee() {
		return examfee;

	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", Examfee=" + examfee + "]";
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getExamfee() {
		return examfee;
	}

	public void setExamfee(double examfee) {
		examfee = examfee;
	}

	public Student() {
	}
}