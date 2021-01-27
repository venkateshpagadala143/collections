package com.Strings;

import java.util.Scanner;

public class SplitStringInSpecificChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String word = sc.nextLine();
		System.out.println("Enter a Character from given String where should i split");
		String cha = sc.next();
		getSplitAtSpecialChar(word, cha);
	}

	private static void getSplitAtSpecialChar(String word, String cha) {
		if (cha.length() == 1) {
			String[] words = word.split(cha);
			if(words.length==1) {
				System.out.println("Entered String is :"+words[0]);
				System.out.println("your entered character '"+cha+"' not in the given String");
			}else {
				for (String string : words) {
					System.out.println(string);
				}	
			}
			 
		} else {
			System.out.println("please Enter a valid Character");
		}

	}

}
