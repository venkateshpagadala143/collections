package com.ojas.cirlcle;

import java.util.Scanner;

public class CircleTesting {
	public static void main(String[] args) {
		System.out.println("Enter Radius and Hight");
		Scanner sc = new Scanner(System.in);
		Cylender cyl = new Cylender(sc.nextDouble(), sc.nextDouble());
		System.out.println("cylender volume is :  "+cyl.getVolume());
		System.out.println("Area of Circle is :  "+cyl.getArea());

	}

}
