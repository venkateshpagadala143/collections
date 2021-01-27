import java.util.Scanner;

public class FindLastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 and number2");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		System.out.println(findLastDigit(number1, number2));

	}

	private static boolean findLastDigit(int number1, int number2) {
		int num1last = number1 % 10;
		int num2last = number2 % 10;
		if (num1last == num2last) {
			return true;
		}
		return false;

	}

}
