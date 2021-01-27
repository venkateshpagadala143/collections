import java.util.Scanner;

public class PancakeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size");
		int size = sc.nextInt();
		System.out.println("Enter your Array Elements");
		int pancake[] = new int[size];
		for (int index = 0; index < pancake.length; index++) {
			pancake[index] = sc.nextInt();
		}
		getSortedpancake(pancake);
	}

	private static void getSortedpancake(int[] pancake) {
		int n = pancake.length;
		for (int currentSize = n; currentSize > 1; currentSize--) {
			int highindex = findMaxIndex(pancake, currentSize);
			if (currentSize > 1) {
				swaptheNumbers(pancake, highindex, currentSize);
			}
		}
		for (int i = 0; i < pancake.length; i++) {
			System.out.println(pancake[i]);
		}
	}

	private static int findMaxIndex(int[] pancake, int currentSize) {
		int n = pancake.length - 1;
		int max = pancake[0];
		int indexvalue = 0;
		for (int index = 0; index < currentSize; index++) {
			if (max < pancake[index]) {
				max = pancake[index];
				indexvalue = index;
			}
		}
		return indexvalue;
	}

	private static void swaptheNumbers(int[] pancake, int max, int currentSize) {
		int firsttemp = pancake[0];
		pancake[0] = pancake[max];
		pancake[max] = firsttemp;
		int lasttemp = pancake[currentSize - 1];
		pancake[currentSize - 1] = pancake[0];
		pancake[0] = lasttemp;
	}
}
