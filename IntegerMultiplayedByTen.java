package _09_01_2021_lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IntegerMultiplayedByTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		Integer[] num = new Integer[size];
		for (int insert = 0; insert < num.length; insert++) {
			num[insert] = sc.nextInt();
		}
		//taking input form user
		List<Integer> list = new ArrayList<>(Arrays.asList(num));
		//Manually  passing the Input 
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		numMultipledByTen(list1);

	}

	private static void numMultipledByTen(List<Integer> list) {
		List<Integer> mulnums = list.stream().map(num -> (num + 1) * 10).collect(Collectors.toList());
		mulnums.forEach(nums -> System.out.println(nums));
	}

}
