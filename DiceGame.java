package com.ojas;

import java.util.Random;
import java.util.Scanner;

class Dice {
	int faceValue;

	void roll() {
		Random ran = new Random();
		faceValue = 1 + (ran.nextInt(6));

	}
}

class Player {
	String pname;
	int score;

	void accept(String pname) {
		this.pname = pname;
	}

	void throwDies(Dice d1, Dice d2) {
		d1.roll();
		d2.roll();
		score = d1.faceValue + d2.faceValue;
		System.out.println(score + " = " + d1.faceValue + " + " + d2.faceValue);
	}
}

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Player player1 = new Player();
		System.out.println("Enter 1 Player Name");
		player1.accept(sc.next());
		System.out.println("Enter 2 Player Name");
		Player player2 = new Player();
		player2.accept(sc.next());
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		player1.throwDies(d1, d2);
		player2.throwDies(d1, d2);

		if (player1.score < player2.score) {
			System.out.println(player2.pname);
		} else if (player1.score > player2.score) {
			System.out.println(player1.pname);
		} else {
			System.out.println("please try again");
		}

	}

}
