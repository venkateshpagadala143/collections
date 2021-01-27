package _06_01_2021_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetriveValFromMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Numbers");
		int size = sc.nextInt();
		System.out.println("please Enter ");
		System.out.println("please enter name and phone  number");
		for (int insert = 0; insert < size; insert++) {
			map.put(sc.next(), sc.next());
		}
		retriveValuesFromMap(map);
	}

	private static void retriveValuesFromMap(Map<String, String> map) {
		for (Map.Entry<String, String> values : map.entrySet()) {
			System.out.println(values.getValue());
		}

	}

}
