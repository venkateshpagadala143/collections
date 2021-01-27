package _06_01_2021_collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElementsInList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(16);
		list.add(15);
		list.add(17);
		list.add(18);
		removeDuplicatesFromArrayList(list);
	}

	private static void removeDuplicatesFromArrayList(List<Integer> list) {
		List<Integer> ulist = new ArrayList();
		for (Integer nums : list) {
			if (!ulist.contains(nums)) {
				ulist.add(nums);

			}

		}
		System.out.println("The list with  duplicates :" + list);

		System.out.println("The list without duplicates :" + ulist);
	}
}
