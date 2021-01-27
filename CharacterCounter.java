package com.ojas.string;

import java.util.Scanner;

public class CharacterCounter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name ");
		String name = sc.next();
		System.out.println("Enter character to find occurencres");
		String serchchar = sc.next();
		if (serchchar.length() == 1) {
			int count = getCountOfcharacter(name, serchchar);
			System.out.println(count);

		} else {
			System.out.println("Enter only one character");
		}
	}

	private static int getCountOfcharacter(String name, String cha) {
		if (name == null || cha == null) {
			return -1;
		}
		int count = 0;
		for (int chars = 0; chars < name.length(); chars++) {
			String str = "" + name.charAt(chars);
			String str2 = "" + cha.charAt(0);
			if (str.equalsIgnoreCase(str2)) {
				count++;
			}
		}
		if (count >= 1) {

			return count;
		} else {
			return -1;
		}
	}

}
