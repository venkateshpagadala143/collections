package com.ojas.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StorePhoneNum {
	static int number = 1;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please Select one option");
			System.out.println("1.Add PhoneNum");
			System.out.println("2.Search phoneNumber");
			System.out.println("3.exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				storeUserInfo(sc);
				break;
			case 2:
				searchUserInfo();
				break;
			case 3:
				System.out.println("Thank you" + "\n" + "Your Session Has Been Compleated");
				System.exit(3);

			}

		}
	}

	private static void searchUserInfo() throws IOException {
		FileReader fr = new FileReader("E:/Praveen/PhoneNum.txt");
		BufferedReader bf = new BufferedReader(fr);
		User[] usr = new User[number];
		String line;
		int num = 0;
		while ((line = bf.readLine()) != null) {
			String str[] = line.split(",");
			User user = new User(str[0], str[1]);
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println("the number is" + num);
			usr[num] = user;

			number++;
		}
		System.out.println("Enter an UserName");
		Scanner sc = new Scanner(System.in);
		String usrName = sc.next();
		number = number - 2;
		System.out.println(number + 1);
		for (User user : usr) {
			if (user.useName.equalsIgnoreCase(usrName)) {
				System.out.println(user.useName + "," + user.phoneNumber);
				number = 1;
				break;
			}
			System.out.println("please Enter a valid  name");
			number = 1;

		}

	}

	private static void storeUserInfo(Scanner sc) throws IOException {
		User usr = new User();
		System.out.println("please Enter your Name and PhoneNumber");
		usr.setUseName(sc.next());
		usr.setPhoneNumber(sc.next());
		String phoneNum = usr.getPhoneNumber();

		String phoneNumber = "";
		for (int index = 0; index < phoneNum.length(); index++) {
			if (Character.isDigit(phoneNum.charAt(index))) {
				phoneNumber += phoneNum.charAt(index);

			}

		}

		if (phoneNumber.length() == 10 && Character.getNumericValue(phoneNumber.charAt(0)) > 5) {
			FileWriter fw = new FileWriter("E://Praveen//PhoneNum.txt", true);
			String res = usr.getUseName() + "," + usr.getPhoneNumber();
			fw.write("\r\n" + res);
			fw.flush();
			fw.close();

		} else {
			System.out.println("please Enter a valid PhoneNumber");
		}

	}

}
