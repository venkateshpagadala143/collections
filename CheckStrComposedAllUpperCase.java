package com.Strings;

import java.util.Scanner;

public class CheckStrComposedAllUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Any word");
		String word = sc.next();
		checkLowerCaseOrNot(word);
	}

	private static void checkLowerCaseOrNot(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (Character.isUpperCase((word.charAt(index)))) {
				count++;
			}
		}
		if(word.length()==count) {
			System.out.println("the given String all alphabets are caps");
		}else {
			System.out.println("the Given Sting consisting of "+"\n"+ "small characters are : "+(word.length()-count)+"   "+"\n"+"Caps Characters are :"+count);
		}

	}

}


