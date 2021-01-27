package com.Strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any word");
		String  word=sc.next();
		getStringReverse(word);
	}

	private static void getStringReverse(String word) {
		String res="";
		for (int index = word.length()-1; index >=0; index--) {
			res+=word.charAt(index);
			
		}
		System.out.println(res);
		
	}

}
