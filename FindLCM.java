package com.String;

import java.util.Scanner;

public class FindLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Number1 and Number2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getLCM(num1, num2));
	}

	private static int getLCM(int num1, int num2) 
	{
		if (num1 > 0 && num2 > 0) 
		{
			int num3 = num1 * num2;
			return num3;
		} else 
		{
			return -1;
		}

	}

}
