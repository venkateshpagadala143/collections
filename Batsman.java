package com.ojas.ArrengeString;

import java.util.Scanner;

public class Batsman {
	String batsName;
	int runs;
	int matches;
	float batting_avg;

	public Batsman(String batsName, int runs, int matches) {
		super();
		this.batsName = batsName;
		this.runs = runs;
		this.matches = matches;

	}

	void computeBattingAvg() {
		if (runs < 0 && matches < 0) {
			System.out.println("Error");

		} else if (matches == 0 && runs > 0) {
			System.out.println("Error");

		} else {
			batting_avg = runs / matches;
			System.out.println("Batsman Name :" + batsName + "\n" + "batting_avg : " + batting_avg);
			;

		}

	}

	void getStastistics() {
		if (runs < 0 && matches < 0) {
			System.out.println("Error");

		} else if (matches == 0 && runs > 0) {
			System.out.println("Error");

		} else {

			System.out.println("Batsman Name :" + batsName + "\n" + "matches : " + matches + "\n" + "Runs : " + runs);
			;

		}

	}

	public static void main(String[] args) {
		System.out.println("please Enter BatsMan Name and  Runs  and  Matches");
		Scanner sc = new Scanner(System.in);

		Batsman bat = new Batsman(sc.next(), sc.nextInt(), sc.nextInt());
		bat.computeBattingAvg();
		bat.getStastistics();
	}

}
