import java.util.Scanner;

public class FindnearestTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		findDifferece(num1, num2);
		// findDifferece(num2);

	}

	private static int findDifferece(int num1, int num2) {
		int differnum1 = num1 - 10;
		int differnum2 = num2 - 10;
		int differencenum1 = Math.abs(differnum1);
		int differencenum2 = Math.abs(differnum2);

		if (differencenum1 == differencenum2) {
			System.out.println("0");
		} else if (differencenum1 < differencenum2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		return num2;
	}

}
