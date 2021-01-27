package com.String;

import java.util.Scanner;

public class GeneretePalindrome {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		addPalindrome(num);
	}

	private static void addPalindrome(int num) 
	{
		if (palindromeCheck(num))
		{
			System.out.println("Given Number is alreasy palindrome");
		} else 
		{
			while (!palindromeCheck(num))
			{
				int rnum = numRevese(num);
				int sum = num + rnum;
				System.out.print(num + "," + rnum + ",");
				num = sum;
			}
			System.out.println(num);
			System.out.println("Last number is palindrome");
		}
	}

	private static int numRevese(int num) 
	{
		int rnum = 0;
		while (num != 0)
		{
			int rem = num % 10;
			rnum = rnum * 10 + rem;
			num = num / 10;
		}
		return rnum;

	}

	private static boolean palindromeCheck(int num)
	{
		int rnum = numRevese(num);

		if (num == rnum)
		{
			return true;
		} else {

			return false;

		}

	}
}