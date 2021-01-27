package _01_04_2021_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCopy {
	public static void main(String[] args) {
		Set<String> sourceSet = new LinkedHashSet<>();
		sourceSet.add("name1");
		sourceSet.add("name2");
		sourceSet.add("name3");
		sourceSet.add("name4");
		System.out.println("Elements Of First Set:" + sourceSet);
		Set<String> destinationSet = new LinkedHashSet<>();
		destinationSet.add("surname1");
		destinationSet.add("surname2");
		destinationSet.add("surname3");
		destinationSet.add("surname4");
		System.out.println("Elements Of Second Set :" + destinationSet);
		int result = copySet(sourceSet, destinationSet);
		if (result == 1) {
			System.out.println("The Set is Null");
		} else {
			System.out.println("The Set is Successfully Copyed :" + sourceSet);
		}
	}

	public static int copySet(Set<String> sourceSet, Set<String> destinationSet) {
		if (sourceSet == null) {
			return 1;
		} else {
			sourceSet.addAll(destinationSet);
			return 0;
		}
	}

}
