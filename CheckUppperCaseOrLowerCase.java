package com.Strings;

import java.util.Scanner;

public class CheckUppperCaseOrLowerCase {
	public static void main(String[] args) {
		System.out.println("Enter any word");
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		checkLowerCaseOrUpperCase(word);
		
	}

	private static void checkLowerCaseOrUpperCase(String word) {
		String upword=word.toUpperCase();
		String loeWord=word.toLowerCase();
		if(word.equals(upword)) {
			System.out.println("given word all characters are uppercase");
		}else if(word.equals(loeWord)) {
			System.out.println("given word all characters are Lowercase");
		}else {
			System.out.println("given word is combination of upper and lower cases");
		}
		
	}

}
