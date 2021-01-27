package com.ojas.strings;

import java.util.Scanner;

public class AddingIntegerToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		int num = sc.nextInt();
		System.out.println("Enter a string");
		String name = sc.next();
		addIntandString(num,name);
		
	}

	private static void addIntandString(int num, String name) {
		String add = num + name;
		System.out.println("Combination of string and integer : "+add);
		
	}

}
