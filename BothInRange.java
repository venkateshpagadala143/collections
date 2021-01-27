import java.util.Scanner;

public class BothInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();

		System.out.println(findInRange(number));
	}

	private static boolean findInRange(int number) {
		if (number >= 30 && number <= 50) {
			return true;
		}
		return false;

	}

}
