package com.ojas.strings;

import java.util.Scanner;

public class CapsFirstCharInStr {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String");
	String name = sc.next();
	is_firstCharInStr(name);
		
	}

	private static void is_firstCharInStr(String name) {
		if(Character.isUpperCase(name.charAt(0))) {
			System.out.println(name);
		}
		else {
			char ch = Character.toUpperCase(name.charAt(0));
			name =ch + name.substring(1);
			System.out.println(name);
		}
		
	}

}
