package oopsprograms;

import java.util.Scanner;

public class SearchaStringInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Names");
		int size = sc.nextInt();
		System.out.println("Enter names");
		String[] names = new String[size];
		for (int insert = 0; insert < names.length; insert++) {
			names[insert] = sc.next();
		}
		System.out.println("Enter the search word");
		String word = sc.next();
		if (findName(word, names)) {
			System.out.println(word + "  Found!");
		} else {
			System.out.println(word + "  not Found!");
		}

	}

	private static Boolean findName(String word, String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (names[index].equals(word)) {
				return true;
			}

		}
		return false;

	}

}
