package com.String;

import java.util.Scanner;

public class SumOfDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Numbr");
		double number = sc.nextDouble();
		String doubleNum = Double.toString(number);
		int indexvalue= doubleNum.indexOf(".");
		String doublesum = concateSumofDigits(doubleNum, indexvalue);
		System.out.println(doublesum);
			}

		private static String concateSumofDigits(String doublevalue, int indexvalue) 
	{
		int leftsum = 0;
		int rightsum = 0;
		for (int i = 0; i < doublevalue.length(); i++) 
		{
			if (i < indexvalue) 
			{
				leftsum += Character.getNumericValue(doublevalue.charAt(i));

			} else if (i > indexvalue)
			{
				rightsum += Character.getNumericValue(doublevalue.charAt(i));

			}
		}
		String leftSum = Integer.toString(leftsum);
		String rightSum = Integer.toString(rightsum);
		String str =leftSum + ":" + rightSum;
		return str;

	}

}
