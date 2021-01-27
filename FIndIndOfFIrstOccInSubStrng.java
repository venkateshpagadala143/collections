package com.ojas.strings;

import java.util.Scanner;

public class FIndIndOfFIrstOccInSubStrng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("Enter the Substring");
		String subStr = sc.next();
		is_FIrstOccInSubStrng(str, subStr);
	}

	private static void is_FIrstOccInSubStrng(String str, String subStr) {

		if (str.contains(subStr)) {

			for (int index = 0; index < str.length(); index++) {
				if (subStr.charAt(0) == str.charAt(index)) {
					System.out.println("The given sub string first letter in string index" + index);
					break;
				}

			}
		} else {
			System.out.println("The given sub string is not in the string");
		}
	}

}
