package com.ojas;

import java.util.Scanner;

public class PrintFizzBizz {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		printFizBiz(num);

		
	}

	private static void printFizBiz(int num) {
		if (num % 5 == 0 && num % 3 == 0) 
		{
			System.out.println("FIZZBIZZ");
		} else if (num % 5 == 0)
		{
			System.out.println("BIZZ");

		} else if (num % 3 == 0)
		{
			System.out.println("FIZZ");
		} else {
			System.out.println("Error");
		}
		
	}

}
