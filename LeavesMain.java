package com.ojas.Exception;

import java.util.Scanner;

public class LeavesMain {
	public static void main(String[] args) throws LeaveQuotaExceedException {
		System.out.println("Enter how many leaves you want");
		Scanner sc=new Scanner(System.in);
		
	LeaveSystem leav=new LeaveSystem(sc.nextInt());
	      leav.checkLeaves();
	}

}
