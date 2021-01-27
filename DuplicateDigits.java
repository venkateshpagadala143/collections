package com.ojas;

import java.util.Scanner;

public class DuplicateDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numver");
		String number = sc.next();
		getDuplicateDigits(number);
	}

	private static void getDuplicateDigits(String number) {
		int count = 1;
		String modnumber = number;

		for (int index = 0; index < number.length(); index++) {
			number = modnumber;
			count = 1;
			for (int check = index + 1; check < number.length(); check++) {
				if (Character.isDigit(number.charAt(check))) {
					int num1 = Character.getNumericValue(number.charAt(index));
					int num2 = Character.getNumericValue(number.charAt(check));
					if (num1 == num2) {
						modnumber = modnumber.replace(number.charAt(check), 'x');
						count++;
					}

				}
			}
			if (count > 1 && number.charAt(index) != 'x') {
				System.out.println(number.charAt(index));
			}
		}

	}

}
