package _01_04_2021_collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
	Map<Integer, Employee> mapCollection;

	public MapOperations() {
		mapCollection = new HashMap<Integer, Employee>();
	}

	void addEmployee(Employee emp) {
		int check = 0;
		if (mapCollection.isEmpty()) {
			mapCollection.put(emp.getEmpId(), emp);
		} else {
			for (Map.Entry<Integer, Employee> empData : mapCollection.entrySet()) {
				if (empData.getKey() == emp.getEmpId()) {
					check = 1;
					break;
				}
			}
			if (check == 0) {
				mapCollection.put(emp.getEmpId(), emp);
			} else {
				System.out.println("The EmpId Already Existed Please Enter another Id");
			}
		}
	}

	void removeEmployee(int empId) {
		if (mapCollection.containsKey(empId)) {

			mapCollection.remove(empId);
			
		} else {
			System.out.println("empId Not founded");
		}

	}

	void FindEmployee(int empId) {
		if (mapCollection.containsKey(empId)) {
			for (Map.Entry<Integer, Employee> emp : mapCollection.entrySet()) {
				if (emp.getKey() == empId) {
					System.out.println(emp);
				}
			}
		} else {
			System.out.println("empId is not Found");
		}
	}

	void getEmployeeList() {
		for (Map.Entry<Integer, Employee> emp : mapCollection.entrySet()) {
			System.out.println(emp.getValue());
		}
	}

	void menuDrivenMap() {
		String menuDriven = "1.Add Employee";
		menuDriven += "\n2.Remove Employee";
		menuDriven += "\n3.Find Employee";
		menuDriven += "\n4.Get EmployeeList";
		menuDriven += "\n5.Exit";
		menuDriven += "\n Please Chose One option ?";
		System.out.println(menuDriven);
	}

}
