package com.ojas;

import java.util.Scanner;

public class GivenStringNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word here");
		String word=sc.next();
		findGivenStringisNumberOrNot(word);
	}

	private static void findGivenStringisNumberOrNot(String word) {
		int count=0;
		for(int index=0;index<word.length();index++) {
			if(Character.isDigit(word.charAt(index))) {
				count++;
			}
		}
		if(word.length()==count) {
		System.out.println(word+" : is Number");
		}else {
			System.out.println(word+" : is Not a number");
		}
		
	}

}
