package _13_01_2021;

import java.util.Scanner;

public class FindStringisPossitiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String word = sc.next();
		System.out.println(isPossitiveStr(word));
	}

	private static boolean isPossitiveStr(String word) {
		String name = word.toUpperCase();
		char[] alpha = name.toCharArray();

		for (int index = 0; index < alpha.length - 1; index++) {
			if (alpha[index] > alpha[index + 1]) {
				return false;
			}
		}
		return true;

	}

}
