package com.ojas.strings;

import java.util.Scanner;

public class checkSameIdentity {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Two String ");
		String word1 = sc.next();
		String word2 = sc.next();
		checkIdentity(word1,word2);
	}

	private static void checkIdentity(String word1, String word2) {
		if(word1.equals(word2)) {
			System.out.println("Both Strings Identity are Equal");
			
		}else {
			System.out.println("Both Strings Indentitys are not equal");
		}
		
	}

}
