package com.String;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		System.out.println(getPerfectScore(number));
	}

	private static int getPerfectScore(int number) {
		int sum=0;
		if (number == 0) 
		{
			return -3;
		} else if (number < 0)
		{
			return -2;

		}
	for(int i=1;i<=number/2;i++) {
		if(number%2==0) {
			sum+=i;
			System.out.println(i);
			
		}
	}
	if(sum==number) {
		return 0;
	}else if(sum<number) {
		return 1;
	}else {
		return 1;
	}
	}
	
}
