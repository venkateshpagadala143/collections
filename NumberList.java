package _01_04_2021_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NumberList {
	public static void main(String[] args) throws NumberFormatException {
		String numberStr = "1,2,3,5-6,8-10,8-15,16-25,20-30,22-26";
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter number
		 * separated with , -); String numberStr = sc.next();
		 */
		List<Integer> arrList = getNumberList(numberStr);
		System.out.println("Array List" + arrList);
		Set<Integer> lihSet = new LinkedHashSet<>(arrList);
		System.out.println("Linked Hash Set " + lihSet);

	}

	private static List<Integer> getNumberList(String numberStr) {
		List<Integer> list = new ArrayList<>();
		String[] num = numberStr.split(",");
		for (int index = 0; index < num.length; index++) {

			if (num[index].contains("-")) {
				String _nums = num[index];
				String[] num1 = _nums.split("-");
				int first = Integer.parseInt(num1[0]);
				int second = Integer.parseInt(num1[1]);
				for (int insert = first; insert <= second; insert++) {

					list.add(insert);
				}
			} else {

				list.add(Integer.parseInt(num[index]));
			}
		}
		return list;
	}
}
