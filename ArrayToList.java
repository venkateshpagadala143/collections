package _01_04_2021_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of The Array");
		int size = sc.nextInt();
		String[] inputArr = new String[size];
		System.out.println("Enter the Array Elements");
		for (int insert = 0; insert < inputArr.length; insert++) {
			inputArr[insert] = sc.next();

		}
		convertArrayToList(inputArr);

	}

	private static void convertArrayToList(String[] inputArr) {
		// Storing Array Elements in String
		String strarr = "The Array Elemts are\n" + Arrays.toString(inputArr);
		// asList Method consisting in the Arrays class 
		// it will Store array elements in list
		List<String> list = new ArrayList<>(Arrays.asList(inputArr));
		// printing Array Elements
		System.out.println("The ArrayList Elements are");
		for (String string : list) {
			System.out.println(string);
		}

	}

}
