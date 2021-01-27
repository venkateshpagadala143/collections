import java.util.Scanner;

public class MyRecursiveSelectionSort {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("enter array size");
		int[] inputArr = new int[scr.nextInt()];
		System.out.println("enter " + inputArr.length + " array elements");
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = scr.nextInt();
		}
		selectionSort(inputArr, 0, inputArr.length);
		//printing Sorted array
		for (int i : inputArr) {
			System.out.println(inputArr[i - 1]);
		}
	}

	private static void selectionSort(int[] inputArr, int index, int arrlength) {
		//finding minimum index in Array
		int min_index = findMinindex(inputArr, index);
		//Swapping minimum index with first index
		Swap(inputArr, min_index, index);
		if (index + 1 < inputArr.length) {
			//recursive method for sorting for remaining elements
			selectionSort(inputArr, index + 1, arrlength);
		}

	}

	private static void Swap(int[] inputArr, int min_index, int index) {
		int lowtemp = inputArr[index];
		inputArr[index] = inputArr[min_index];
		inputArr[min_index] = lowtemp;

	}

	private static int findMinindex(int[] inputArr, int index) {
		int minvalue = inputArr[index];
		int minIndex = 0;
		for (int i = 0; index < inputArr.length; index++) {
			if (minvalue == inputArr[i]) {
				minvalue = inputArr[i];
				minIndex = i;
			}
		}
		return minIndex;

	}

}
