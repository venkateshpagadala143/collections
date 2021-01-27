package com.ojas;

public class RussianMultiplication {

	public static void main(String[] args) {
		int res = russianPeasant(10, 21);
		System.out.println(res);
	}

	static int russianPeasant(int a, int b) {

		int res = 0;

		while (b > 0) {

			if (b % 2 != 0)
				res = res + a;

			a = a << 1;
			b = b >> 1;
		}
		return res;
	}

}
