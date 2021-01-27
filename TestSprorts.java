package com.ojas.sports;
import java.util.Scanner;

public class TestSprorts {
	public static void main(String[] args) {
		Soccer game=new Soccer();
		System.out.println("please Enter your sportName");
		Scanner sc=new Scanner(System.in);
		game.getName(sc.next());
		
		
		System.out.println((game.getNumberOfTeamMembers()));
	}

}
