package com.ojas.strings;

import java.util.Scanner;

public class SpecificCharInString {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.nextLine();
		System.out.println("Enter a specific Character");
		String cha  = sc.next();
		if(cha.length()>1) {
			System.out.println(" please Enter a valid input");
			
		}
		else {
			is_countOfSpcifichar(word,cha);
			
		}
	}

	private static void is_countOfSpcifichar(String word, String cha) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if(cha.charAt(0) == word.charAt(index)) {
				
				count++;
			}
			
		}
		System.out.println("Specific character count is : "+count);
		
		
	}
	

}
