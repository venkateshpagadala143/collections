package com.ojas.strings;

import java.util.Scanner;

public class SpecificSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string latter");
		String word = sc.next();
		System.out.println("Enter sub string");
		String subStr=sc.next();
		is_SpecificSubString(word,subStr);
		
	}

	private static void is_SpecificSubString(String word, String subStr) {
		if(word.contains(subStr)) {
			System.out.println("given substring contains in string ");
		}
		else {
			System.out.println("given substring not contains in string ");
		}
		
	}

}

