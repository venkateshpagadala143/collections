import java.util.Scanner;

public class MyMergeSort {
	void merge(int arr[], int beg, int mid, int end) {

		int leftarrsize = mid - beg + 1;
		int rightarrsize = end - mid;
		// Declaring subArrys
		int LeftArray[] = new int[leftarrsize];
		int RightArray[] = new int[rightarrsize];

		// storing elements in subArry
		for (int i = 0; i < leftarrsize; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < rightarrsize; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		//merging sub Arrays
		while (i < leftarrsize && j < rightarrsize) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		// storing reaming elements in subArray
		while (i < leftarrsize) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < rightarrsize) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
	}

	public static void main(String args[]) {

		Scanner scr = new Scanner(System.in);
		System.out.println("enter array size");
		int[] inputArr = new int[scr.nextInt()];
		System.out.println("enter " + inputArr.length + " array elements");
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = scr.nextInt();
		}
		
		MyMergeSort ob = new MyMergeSort();
		ob.sort(inputArr, 0, inputArr.length - 1);

		System.out.println("\nSorted array");
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i] + "");
		}
	}
}