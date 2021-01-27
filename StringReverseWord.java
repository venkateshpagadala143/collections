package com.String;

import java.util.Scanner;

public class StringReverseWord {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String here");
		String str = sc.nextLine();
		String revStr = getReverse(str);
		System.out.println(revStr);
		// by using String buffer reverse method
		String str1 = againGetReverse(str);
		System.out.println(str1);

	}

	private static String againGetReverse(String str) 
	{
		String[] words = str.split(" ");
		StringBuffer revstr = new StringBuffer();
		for (int i = 0; i < words.length; i++)
		{
			StringBuffer word = new StringBuffer(words[i]);
			StringBuffer revword = word.reverse();
			revstr.append(revword + " ");

		}
		return revstr.toString();

	}

	private static String getReverse(String str) 
	{
		String[] words = str.split(" ");
		String revStr = "";
		for (int i = 0; i < words.length; i++)
		{
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) 
			{
				revWord = revWord + word.charAt(j);
			}
			revStr = revStr + revWord + " ";
		}

		return revStr;

	}

}
