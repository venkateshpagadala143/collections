package com.ojas.strings;

import java.util.Scanner;

public class CheckFirstCharLowercaseInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.next();
		is_checkLowerCase(word);
	}

	private static void is_checkLowerCase(String word) {
		if(Character.isLowerCase(word.charAt(0))) {
			System.out.println("First character is lowercase");
		}
		else {
			System.out.println("Not Lowercase");
		}
		
		
	}

}
