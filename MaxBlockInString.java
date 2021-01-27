package com.ojas.String;

import java.util.Scanner;

public class MaxBlockInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String name = sc.next();

		getMaxBlockInSTring(name);
	}

	private static void getMaxBlockInSTring(String name) {

		int count = 1;
		int newcount = 1;
		for (int j = 0; j < name.length() - 1; j++) {
			if (name.charAt(j) == name.charAt(j + 1)) {
				count++;
			} else {
				if (newcount < count) {
					newcount = count;
				}
				count = 1;
			}
		}
		if (newcount == 1||count>newcount) {
			System.out.println(count);
		} else {

			System.out.println(newcount);
		}

	}

}
