package _13_01_2021;

import java.util.Scanner;

public class FindPerfectOrAbudentOrdeficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc.nextInt();

		System.out.println(sumOfProperDivisors(number));
	}

	private static int sumOfProperDivisors(int number) {
		if (number < 0) {
			return -2;

		} else if (number == 0) {
			return -3;
		} else {
			int sum = 0;

			for (int index = 1; index <= number / 2; index++) {
				if (number % index == 0) {
					sum += index;
				}
			}
			if (number == sum) {
				return 0;

			} else if (number < sum) {
				return 1;

			} else {
				return -1;
			}
		}
	}
}