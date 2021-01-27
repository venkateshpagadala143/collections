package com.Strings;

import java.util.Scanner;

public class ConverIntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		convertInttoStr(num);

	}

	private static void convertInttoStr(int num) {
		String number;
		number=String.valueOf(num);
		System.out.println(number);

	}

}
