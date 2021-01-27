package com.ojas.String;

import java.util.Scanner;

public class getPalindromeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if (num <= 100 || num >= 999 || num <= 0) {
			System.out.println("Error");
		} else {

			getPalindromeList(num);

		}
	}

	static boolean checkPalndrome(int num) {
		int revnum = reverseNumber(num);
		if (num == revnum) {
			return true;

		} else {
			return false;
		}

	}

	private static void getPalindromeList(int num) {
		int count = 0;

		if (checkPalndrome(num)) {

		} else {
			while (!checkPalndrome(num) && count < 20) {

				int revnum = reverseNumber(num);
				System.out.print(num + "," + revnum + ",");
				int sum = num + revnum;
				num = sum;
				count = count + 2;

			}
			System.out.print(num);
			System.out.println();

			System.out.println("the last Number is palindrome");

		}
	}

	private static boolean checkPalindrome() {
		// TODO Auto-generated method stub
		return false;
	}

	private static int reverseNumber(int num) {
		int revnum = 0;
		while (num != 0) {
			int rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;
		}

		return revnum;
	}

}
