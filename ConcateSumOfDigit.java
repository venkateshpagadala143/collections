package _13_01_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ConcateSumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Eny Decimal Number");
		double num = sc.nextDouble();
		String numb = String.valueOf(num);
		System.out.println(numb);

		String[] numbs = numb.split("\\.");
		System.out.println(Arrays.asList(numbs));
		System.out.println(numbs[0]);
		int left = getConcateSumOfDigit(numbs[0]);
		int right = getConcateSumOfDigit(numbs[1]);
		System.out.println(left + ":" + right);

	}

	private static int getConcateSumOfDigit(String number) {
		int num = Integer.parseInt(number);
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		return sum;

	}
}
