package InheritenceDemo3;

import java.util.Scanner;

public class Cleark extends Manager {
	static int speed;
	static int accurency;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccurency() {
		return accurency;
	}

	public void setAccurency(int accurency) {
		Cleark.accurency = accurency;
	}

	public Cleark(int speed, int accurency) {
		super();
		Cleark.speed = speed;
		Cleark.accurency = accurency;
	}

	public Cleark() {

	}

	public Cleark(int empId, String empName, double empSalary) {
		super(empId, empName, empSalary,mt);

	}

	static void getSalary(int speed, int accurency) {
		if (speed > 70 && accurency > 80) {
			double sal = empSalary + 1000;
			System.out.println("previous Salary is : " + empSalary);
			System.out.println("updated Salary is :" + sal);
			Cleark emp = new Cleark(empId, empName, sal);
			System.out.println(emp);
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("please improve your speed" + "\n" + "please enter your speed and accurency");
			speed = sc.nextInt();
			accurency = sc.nextInt();
			getSalary(speed,accurency);
			
		}

	}

	@Override
	public String toString() {
		return "Cleark [ EmpId=" + getEmpId() + ", EmpName=" + getEmpName() + ",EmpSalary=" + getEmpSalary() + "]";
	}

}
