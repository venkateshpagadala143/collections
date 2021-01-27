package _06_01_2021_collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveWhiteSpacesFromStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Pera");
		String word = sc.nextLine();
		//String word = "hi how are yout    kd! kkd  !  ?";
		removeWhiteSpacesFromStr(word);
	}

	private static void removeWhiteSpacesFromStr(String word) {
		String[] words = word.split(" ");
		String peragraph = "";
		List<String> pera = new ArrayList<>();
		Set<String> set = new LinkedHashSet<>();
		for (int insert = 0; insert < words.length; insert++) {
			if (!words[insert].isEmpty()) {
				pera.add(words[insert]);
			}
		}
		for (String peragra : pera) {
			peragraph += peragra + " ";
		}
		System.out.println("the given pera is :" + word);
		System.out.println("after removing spaces :" + peragraph);
	}

}
