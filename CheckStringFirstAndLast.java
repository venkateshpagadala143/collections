package com.Strings;

import java.util.Scanner;

public class CheckStringFirstAndLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter a word ");
		String word = sc.next();
		System.out.println("Please Enter a checking Character");
		String cha = sc.next();
		checkStrFirAndLast(word, cha);

	}

	private static void checkStrFirAndLast(String word, String cha) {
		if(cha.length()==1) {
			if(word.charAt(0)==cha.charAt(0)&&word.charAt(word.length()-1)==cha.charAt(0)) {
				System.out.println("String  first and Last characters are given character");
			}else {
				System.out.println("String  first and Last characters are not given character");
			}
		}

	}

}
