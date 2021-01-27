package _01_04_2021_collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertArrayToMap {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of The Array");
		int size = sc.nextInt();
		String[] inputArr = new String[size];
		System.out.println("Enter the Array Elements");
		for (int insert = 0; insert < inputArr.length; insert++) {
			inputArr[insert] = sc.next();

		}
		convertArrayToMap(inputArr);

	}

	private static void convertArrayToMap(String[] inputArr) {
		Map<Integer, String> map = new LinkedHashMap<>();
		int num = 1;
		for (int Index = 0; Index < inputArr.length; Index++) {
			if (inputArr[Index] != null) {
				map.put(num, inputArr[Index]);
				num++;

			}
		}
		System.out.println("Array values in map");
		for (Map.Entry<Integer, String> names : map.entrySet()) {
			{
				System.out.println(names.getKey() + "," + names.getValue());
			}

		}

	}
}
