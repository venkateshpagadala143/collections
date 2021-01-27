package _13_01_2021;

import java.util.Scanner;

public class LeftTruncatablePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		for (int insert = 0; insert < num.length; insert++) {
			num[insert] = sc.nextInt();

		}
		System.out.println(isLeftTurncatablePrime(num));

	}

	private static boolean isLeftTurncatablePrime(int[] num) {
		for (int index = 0; index < num.length; index++) {
			int count = checkLeftDigtt(num[index]);
			if (count > 0) {
				return false;
			}
		}
		return true;

	}

	private static int checkLeftDigtt(int num) {
		int count = 0;
		int rev = 10;
		while (num * 10 > rev) {

			int rem = num % rev;
			rev = rev * 10;
			if (isPrime(rem)) {

			} else {
				count++;
				break;
			}

		}
		return count;

	}

	private static boolean isPrime(int num) {

		if (num < 1) {
			return false;
		}
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				return false;
			}

		}

		return true;
	}

}
