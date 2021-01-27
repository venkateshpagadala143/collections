package _06_01_2021_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateOccurInStrMap {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any string ");
		String name = sc.next();
		findAllCharacters(name);

	}

	private static void findAllCharacters(String name) {
		Map<Character, Integer> map = new HashMap<>();
		char[] alph = name.toCharArray();
		for (int insert = 0; insert < alph.length; insert++) {
			if (map.containsKey(alph[insert])) {

				map.put(alph[insert], map.get(alph[insert]) + 1);

			} else {
				map.put(alph[insert], 1);
			}
		}
		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			System.out.println(c.getKey() + "-" + c.getValue());

		}

	}

}
