package _13_01_2021;

import java.util.Scanner;

public class MaskedMailId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your EmailId");
		String email = sc.next();

		String check = CheckMailIdValid.checkEmailId(email);
		if (check.equals("valid")) {
			maskMailId(email);
		} else {
			System.out.println("Email is Not Valid");
		}
	}

	private static void maskMailId(String email) {
		String maskEmail = "";

		for (int index = 0; index < email.length(); index++) {
			if (index >= 2 && index < email.indexOf('@')) {
				maskEmail += "x";

			} else {
				maskEmail += email.charAt(index);
			}
		}
		System.out.println(maskEmail);

	}

}
