package com.String;

import java.util.Scanner;

public class NameScore {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Any String");
		String name = sc.next();
		getNameScore(name);

	}

	private static void getNameScore(String name) 
	{
		int nasc = 0;
		String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
		String upperAlpha = smallAlpha.toUpperCase();
		for (int i = 0; i < name.length(); i++) 
		{
			for (int j = 0; j < name.length(); j++)
			{
				if (name.charAt(i) == smallAlpha.charAt(j) || name.charAt(i) == upperAlpha.charAt(j))
				{
					nasc += j + 1;

				}
			}
		}
		System.out.println(nasc);

	}

}
