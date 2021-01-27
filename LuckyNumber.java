package com.String;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Date of Birth");
		String dateofBirth = sc.nextLine();
		String dob = findMonthNum(dateofBirth);
		System.out.println(dob);
		getLuckyNum(dob);
	}

	private static String findMonthNum(String dateofBirth) {
		String dob1 = dateofBirth.replace("-", "/");
		String dob2 = dob1.replace("/", "-");

		String[] dob3 = dob2.split("-");
		String[] months = { "jan", "feb", "mar", "apr", "may", "jun", "july", 
				               "aug", "sep", "oct", "nov", "dec" };

		String date = dob3[0];
		String month = dob3[1];
		String year = dob3[2];
		String strMon = "";
		String strMont = month.trim();
		for (int i = 0; i < months.length; i++) {
			if (months[i].equalsIgnoreCase(month)) {
				strMon += i + 1;
				System.out.println();
			}
		}
		String dob = date + strMon + year;
		return dob;
	}

	private static void getLuckyNum(String str) {
		String str1 = str.trim();

		int num = Integer.parseInt(str1);
		while (num > 9) {

			int rem = num % 10;

			num = num / 10;

			num = num + rem;

		}
		System.out.println(num);

	}

}
