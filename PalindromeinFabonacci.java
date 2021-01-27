package com.ojas;

import java.util.Scanner;

public class PalindromeinFabonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first and second numbes");
		int firstnum = sc.nextInt();
		int secondnum = sc.nextInt();
		System.out.println("Enter how many fabanocci shall i check");
		int number=sc.nextInt();
		findFabonacci(number,firstnum, secondnum);
	}

	private static void findFabonacci(int number,int first, int second) {
		
	
		for(int i=0;i<=number;i++) {
			
			int fabnum = first + second;
			if(fabnum>9) {
			palindromeCheck(fabnum);
			}
			first = second;
			second = fabnum;
			System.out.print(fabnum+",");

		}

	}

	private static void palindromeCheck(int fabnumb) {
		int revnum=reverseNumber(fabnumb);
		if(fabnumb==revnum) {
			System.out.println();
			System.out.println(fabnumb+" : fabnumber is palindrome");
		}
		
		
	}

	private static int reverseNumber(int fabnumb) {
		int reversenum=0;
		while(fabnumb!=0) {
			int rem=fabnumb%10;
			reversenum=reversenum*10+rem;
			fabnumb=fabnumb/10;
		}
		return reversenum;
	}

}
