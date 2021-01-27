package com.ojas;

import java.util.Scanner;

public class CharacterOccurence {
	public static void main(String[] args) {
		String name = "paramahamasa";

		getCharactrOccurence(name);
	}

	private static void getCharactrOccurence(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
