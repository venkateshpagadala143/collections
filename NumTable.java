package com.ojas;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class NumTable {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		getNumberTable(num);
		

	}

	private static void getNumberTable(int num) {
		System.out.println(num+ "  Number table is :");
		for (int i = 0; i <= 10; i++)
		{
			int j = num * i;
			System.out.println(num + " * " + i + " = " + j);

		}
		
	}

}
