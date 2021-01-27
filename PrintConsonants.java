package com.String;

import java.util.Scanner;

public class PrintConsonants 
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter your String ");
		String str = sc.nextLine();

		//getConsonats(str);
		againGetConsonants(str);
	}

	private static void againGetConsonants(String str) 
	{
		String str1="";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
		{
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
					||ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] =='O' || ch[i] == 'U') 
			{

			} else
			{
				//for printing in String 
				str1+=ch[i];
				//for printing in char
				System.out.println(ch[i]);
			}
		}
		//printing consonant String 
		System.out.println(str1);

	}

	private static void getConsonats(String str)
	{
		String smAl = "bcdfghjklmnpqrstvwxyz";
		String caAl = smAl.toUpperCase();
		char ch[] = smAl.toCharArray();
		char ch1[] = caAl.toCharArray();

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = 0; j < ch.length; j++) 
			{
				if (str.charAt(i) == (ch[j]) || str.charAt(i) == ch1[j])
				{
					System.out.println(str.charAt(i));
				}

			}

		}
	}
}
