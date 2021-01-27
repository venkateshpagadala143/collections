import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size");
		int size = sc.nextInt();
		System.out.println("Enter your Array Elements");
		int binary[] = new int[size];
		for (int index = 0; index < binary.length; index++) {
			binary[index] = sc.nextInt();
		}
		System.out.println("Enter your Search number");
		int number = sc.nextInt();
		findElmentUsingBinarySearch(binary, number);
	}

	static void findElmentUsingBinarySearch(int[] binary, int number) {
		Arrays.sort(binary);

		int leftIndex = 0;
		int rightIndex = binary.length - 1;
		int mid = (leftIndex + rightIndex) / 2;
		while (leftIndex <= rightIndex)
			if (binary[mid] == number) {
				System.out.println(number + " Found at index of  " + mid);
				break;

			} else if (binary[mid] > number) {

				leftIndex = mid + 1;

			} else if (binary[mid] < number) {
				rightIndex = mid - 1;

			}
		mid = (leftIndex + rightIndex) / 2;

	}
}
