package com.ojas.string;

import java.util.Scanner;

public class DateFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String date = sc.nextLine();
		getDateFormatter(date);
	}

	private static void getDateFormatter(String date) {

		String date1 = date.replace(" ,", ",");
		String date2 = date1.replace(", ", ",");
		String date3 = date2.replace(' ', ',');

		String[] date4 = date3.split(",");

		String[] months = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
		String[] monthsfull = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String day = date4[0];
		String month = date4[1];
		String year = date4[2];
		String modfymonth = "";
		for (int index = 0; index < months.length; index++) {
			if (month.equalsIgnoreCase(months[index]) || month.equalsIgnoreCase(monthsfull[index])) {
				modfymonth += index + 1;
			}
		}

		if (modfymonth.equals("") || Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) {
			System.out.println("null");

		} else {
			System.out.println(modfymonth);
			String modfyDate = year + "-" + modfymonth + "-" + day;
			System.out.println(modfyDate);
		}

	}

}
