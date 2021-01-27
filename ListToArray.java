package _01_04_2021_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListToArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of The Array");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Array Elements");
		for (int insert = 0; insert < size; insert++) {
			list.add(sc.nextInt());
		}
		convertListToArray(list);

	}

	private static void convertListToArray(List<Integer> list) {

		String strlist = "Elements in list\n" + list;
		// Declaring Array Size
		int arr[] = new int[list.size()];
		// Inserting List Elements In Array
		for (int insert = 0; insert < arr.length; insert++) {
			arr[insert] = list.get(insert);

		}
		
		 /* by using to Array Method here we are using Warper classes instead of
		 * Primitive Datatype
		 */

		Integer[] arr1 = list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr1));
		// Storing Array Elements in String
		String strarr = "Elements in Array is\n" + Arrays.toString(arr);
		// printing List And Array Elements
		System.out.println(strlist);
		System.out.println(strarr);

	}

}
