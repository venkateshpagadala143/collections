package com.Strings;

import java.util.Scanner;

public class RemovewhiteSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anyString with Spaces");
		String word=sc.next();
		removeSpaces(word);

	}

	private static void removeSpaces(String word) {
		System.out.println("before Removing Spaces : "+word);
		//trim method is used to remove the unwanted speces in String
		System.out.println("After Removing Spaces : "+word.trim());
		
	}

}
