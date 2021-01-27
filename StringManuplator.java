package com.ojas.string;

import java.util.Scanner;

public class StringManuplator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name here");
		String name = sc.next();
		removeOvels(name);

	}

	private static void removeOvels(String name) {
		String consonents = "bcdfghjklmnpqrstvwxyz";
		char conchar[] = consonents.toCharArray();
		if (name.length() < 0) {
			System.out.println("null");
		}
		for (int namech = 0; namech < name.length(); namech++) {
			for (int conch = 0; conch < consonents.length(); conch++) {
				if (name.charAt(namech) == conchar[conch]) {
					System.out.print(name.charAt(namech));

				}
			}
		}

	}

}
