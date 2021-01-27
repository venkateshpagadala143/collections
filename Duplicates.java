package _01_04_2021_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number of Elements");
		int number = sc.nextInt();
		System.out.println("Please Enter List Elments");
		for (int insert = 0; insert < number; insert++) {
			list.add(sc.nextInt());
		}

		getDuplicateList(list);
		// for Adding Elements Directly
		// ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 45, 55, 3,
		// 32, 22, 22, 55, 1, 3));

	}

	private static void getDuplicateList(ArrayList<Integer> list) {
		HashSet<Integer> uniqueVal = new HashSet<>();
		HashSet<Integer> duplicatVal = new HashSet<>();
		for (Integer integer : list) {
			if (!uniqueVal.add(integer)) {
				duplicatVal.add(integer);
			}
		}
		System.out.println("Duplicate integers in given list is/are " + duplicatVal);
	}
}
