package com.ojas.String;

import java.util.Scanner;

public class WeavedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two names");
		String value1 = sc.nextLine();
		String value2 = sc.nextLine();
		String wavalue=getWeavedString(value1, value2);
		System.out.println(wavalue);
	}

	private static String getWeavedString(String value1, String value2) {
		String wavevalue = "";
		if (value1.equals(null) || value2.equals(null)) {
			wavevalue += -1;
		}
		if (value1.length() > value2.length()) {
			wavevalue += value2 + value1 + value2;

		} else if (value1.length() < value2.length()) {
			wavevalue += value1 + value2 + value1;

		} else {
			for (int index = 0; index < value1.length(); index++) {

				wavevalue += "" + value1.charAt(index) + value2.charAt(index);

			}
		}
		return wavevalue;
	}

}
