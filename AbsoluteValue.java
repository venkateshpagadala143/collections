import java.util.Scanner;

public class AbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();

		System.out.println(findAbsoulutevalue(num));
	}

	private static boolean findAbsoulutevalue(int num) {
		if (num >= 90 && num <= 110) {
			return true;
		} else if (num >= 190 && num <= 210) {
			return true;
		}
		return false;

	}

}
