package _13_01_2021;

import java.util.Scanner;

public class CheckMailIdValid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your EmailId");
		String email = sc.next();
		System.out.println(checkEmailId(email));

	}

	private static String checkEmailId(String email) {
		if (Character.isLowerCase(email.charAt(0))) {
			if (email.contains("@")) {
				int count = 0;
				for (int chek = 0; chek < email.length(); chek++) {
					if (email.charAt(chek) == '@') {
						count++;
					}
				}
				if (count > 1) {
					return "-3";
				}
				int length = email.length();
				String com = email.substring(length - 4, length);
				String co = email.substring(length - 6, length);
				if (com.equals(".com") || co.equals(".co.in")) {
					for (int index = 0; index < email.length(); index++) {
						if (Character.isAlphabetic(email.charAt(index)) || Character.isDigit(email.charAt(index))
								|| email.charAt(index) == '_' || email.charAt(index) == '.'
								|| email.charAt(index) == '@') {

						} else {
							return "-5";
						}

					}
					return "valid";

				} else {
					return "-4";
				}

			} else {
				return "-2";
			}

		} else {
			return "-1";
		}

	}

}
