package com.ojas;

import java.util.Scanner;

public class ReverseStringWithourUsingBuiltInMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name");
		String name = sc.next();
		System.out.println(reverseString(name));
	}

	private static String reverseString(String name) {
		String revname="";
		for (int i = name.length() - 1; i >= 0; i--) {
			revname+=name.charAt(i);
		}
		return revname;

	}

}
