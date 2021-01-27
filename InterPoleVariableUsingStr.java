package com.ojas.strings;

import java.util.Scanner;

public class InterPoleVariableUsingStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name");
		String name = sc.next();
		System.out.println("Enter age ");
		int age = sc.nextInt();
		is_Interpolate(name, age);

	}

	private static void is_Interpolate(String name, int age) {
		String output = String.format("%s is %d years old", name, age);
		System.out.println(output);

	}

}
