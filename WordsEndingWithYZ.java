package com.ojas.String;

import java.util.Scanner;

public class WordsEndingWithYZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words entering");
		int size = sc.nextInt();
		System.out.println("enter String Elements");
		String[] names = new String[size];
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}

		getcountWodrsEndingYZ(names);
	}

	private static void getcountWodrsEndingYZ(String[] names) {
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			String word = names[i];
			int lastindex = word.length() - 1;
			char lastchar = word.charAt(lastindex);
			if (Character.isLetter(lastchar)) {
				if (lastchar == 'y' || lastchar == 'z') {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
