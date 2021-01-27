package _09_01_2021_lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastDigitOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		Integer[] num = new Integer[size];
		for (int insert = 0; insert < num.length; insert++) {
			num[insert] = sc.nextInt();
		}
		//Passing values through console
		List<Integer> list = new ArrayList<>(Arrays.asList(num));
		//passing values manually
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 25, 34, 49, 5));
		findLastDigitOfNumber(list1);

	}

	private static void findLastDigitOfNumber(List<Integer> list) {
		List<Integer> mulnums = list.stream().map(num -> num % 10).collect(Collectors.toList());
		mulnums.forEach(nums -> System.out.println(nums));
	}

}
