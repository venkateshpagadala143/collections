package com.String;

import java.util.Scanner;

public class OccurenceOfChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Name");
		String name = sc.next();
		characterCount(name);
	}

	private static void characterCount(String name) {
		String modifid = name;
		for (int i = 0; i < name.length(); i++) {

			name = modifid;
			int count = 1;
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) { 

					count++;
					modifid = name.replace(name.charAt(j), 'x');

				}
			}
			if (name.charAt(i) != 'x')
				System.out.println(name.charAt(i) + " - " + count);
		}

	}

}
