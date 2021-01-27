import java.util.Scanner;

public class SumDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 and number2 values");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int sum = findSumofNumbers(number1, number2);
		System.out.println("the two numbers sum is ("+number1+","+number2+") = "+sum);
	}

	private static int findSumofNumbers(int number1, int number2) {
		if (number1 == number2) {
			return (number1 + number2) * 2;
		} else {
			return number1 + number2;
		}

	}

}
