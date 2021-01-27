package com.String;

import java.util.Scanner;

public class AdamNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		int rnum = getRevnum(num);
		int snum = num * num;
		int srnum = getRevnum(snum);
		int sanum = rnum * rnum;

		System.out.println(getAdamNum(sanum, srnum));
	}

	private static int getRevnum(int num) 
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

	private static boolean getAdamNum(int num, int rnum) 
	{
		if (num == rnum)
		{
			return true;
		}
		return false;

	}
}
