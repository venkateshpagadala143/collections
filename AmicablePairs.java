package _13_01_2021;

import java.util.Scanner;

public class AmicablePairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int firstNum = sc.nextInt();
		int secondNum = findAmicablePairs(firstNum);
		int secondAmison = findAmicablePairs(secondNum);
		if (firstNum == secondAmison) {
			System.out.println("given " + firstNum + " Amison Number is " + secondNum);

		} else {
			System.out.println("given " + firstNum + " doesnot have any Amison");
		}
	}

	private static int findAmicablePairs(int num) {
		int sum = 0;
		for (int index = 1; index <= num / 2; index++) {
			if (num % index == 0) {
				sum += index;
			}
		}
		return sum;
	}

}
