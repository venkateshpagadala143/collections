package _29_12_02020_IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeDeatials {
	private Employee employeelist[] = new Employee[5];

	public Employee[] getEmployeelist() {
		return employeelist;
	}

	public void setEmployeelist(Employee[] employeelist) {
		this.employeelist = employeelist;
	}

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E://Praveen//EmployeeDeatails.txt");
		BufferedReader br = new BufferedReader(fr);
		readEmployeeDeatails(br);

	}

	private static void readEmployeeDeatails(BufferedReader br) throws IOException {
		EmployeeDeatials empdea = new EmployeeDeatials();
		String res;
		int num = 0;
		while ((res = br.readLine()) != null) {

			String empdata[] = res.split(";");
			Employee emp = new Employee(Integer.parseInt(empdata[0]), empdata[1], empdata[2],
					Double.parseDouble(empdata[3]));
			empdea.employeelist[num] = emp;

			num++;
		}
		for (Employee employee : empdea.employeelist) {
			System.out.println(employee);
		}

	}

}
