package com.ojas;

import java.util.Scanner;

public class ArmStrongCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int temp = num;
		int arm = 0;
		while (num > 0) {
			int reminder = num % 10;
			arm += reminder * reminder * reminder;
			num = num / 10;

		}
		if (temp == arm) {
			System.out.println(arm);
			System.out.println("this is armstrong number ");
		} else{
			
			System.out.println(arm);
		System.out.println("this is not armstrong number");
		}
	}

}
