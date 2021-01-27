package com.ojas;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
	static int balance = 0;
	static int accountNumber = 0;
	int newBalance = 0;

	public void diposit(int amount) {

		newBalance = balance + amount;
		display();
		balance = balance + amount;
		doAgain();
	}

	public void withdrew(int amount) {
		if (amount > balance) {
			System.out.println("Insufficient Balence");
			doAgain();
		} else {
			newBalance = balance - amount;
			display();
			balance = balance - amount;
			doAgain();
		}
	}

	public void display() {
		Customer cs = new Customer();
		System.out.println("Thank you" + cs.getFirstName() + " " + cs.getLastName() + "\n" + "account number is :"
				+ accountNumber);
		System.out.println("your Current Balannce " + balance + "\n" + "yout Update Balannce " + newBalance);

	}

	public void doAgain() {
		System.out.println("Please Enter if You want to " + "\n" + "1.Continue" + "\n" + " 2.Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			doTransactions();
		} else {
			System.out.println("Thank you  Praveen kumar");
		}

	}

	public static void main(String[] args) {
		gotoBankTransaction();

	}

	private static void gotoBankTransaction() {
		Customer cs = new Customer();
		BankAccount ab = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("wlecome To ojas Bank" + "\n" + "Please open your Bank Account");
		System.out.println("please Enter your FirstName and LastName");
		cs.setFirstName(sc.next());
		cs.setLastName(sc.next());
		System.out.println("Enter your Opening Balance");
		balance = sc.nextInt();
		generateAccountNumber();
		System.out.println("Hi  " + cs.getFirstName() + " " + cs.getLastName() + "\n" + "your Opening Balence is :"
				+ " " + balance + "\n" + "your Account Number is : " + accountNumber);

		System.out.println("Enter Account Number");
		int accountnum = sc.nextInt();
		if (accountnum == ab.accountNumber) {
			doTransactions();

		} else {
			System.err.println("Enter a valid Credentials");

		}
	}

	private static void generateAccountNumber() {
		Random ran = new Random();
		accountNumber = ran.nextInt(999999999);

	}

	private static void doTransactions() {
		Customer cs = new Customer();
		cs.setFirstName("Praveen");
		cs.setLastName("Kumar");
		BankAccount ab = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi  " + cs.getFirstName() + "" + cs.getLastName() + "  wlecome to icici Bank" + "\n"
				+ "your current Balence is:" + ab.balance);
		System.out.println("Please Select your option" + "\n" + "1.Diposit" + "\n" + "2.Withdrew");
		int option = sc.nextInt();
		if (option == 1) {

			System.out.println("Enter Diposit Amount");
			int amount = sc.nextInt();
			ab.diposit(amount);

		} else if (option == 2) {
			System.out.println("Enter withdrew Amount");
			int amount = sc.nextInt();
			ab.withdrew(amount);

		} else {
			System.out.println("please enter valid details");
		}

	}

}
