package _09_01_2021_lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveXFromStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		String[] names = new String[size];
		for (int insert = 0; insert < names.length; insert++) {
			names[insert] = sc.next();
		}

		List<String> list = new ArrayList<>(Arrays.asList(names));
		removeXFormAllNames(list);

	}

	private static void removeXFormAllNames(List<String> list) {

		List<String> names = list.stream().map(name -> name.replace("x", "")).collect(Collectors.toList());
		names.forEach(name -> System.out.println(name));
	}

}
