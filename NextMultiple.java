

import java.util.Scanner;

public class NextMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc.nextInt();
		getNextMultiple(number);
	}

	static void getNextMultiple(int number) {

		number = number / 100;
		number = (number + 1) * 100;
		System.out.println(number);

	}

}
