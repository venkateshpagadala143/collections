package com.ojas.coding;

import java.util.Scanner;

public class MirrorString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word ?");
		String word=sc.next();
		
		
		printMirrorChars(word);
	}

	private static void printMirrorChars(String word) {
		String mirrChars="";
		int lastIndex=word.length()-1;
		for(int index=0;index<word.length()/2;index++) {
			
			if(word.charAt(index)==word.charAt(lastIndex)) {
				mirrChars+=word.charAt(index);
				
			}
			lastIndex--;
		}
		System.out.println(mirrChars);
		
	}

}
