package _13_01_2021_oops;

import java.util.Scanner;

public class DisplayCargoDeatails {
	private String name;
	private String Decription;
	private double width;
	private double length;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public static void main(String[] args) {
		DisplayCargoDeatails dc = new DisplayCargoDeatails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		dc.setName(sc.next());
		System.out.println("Enter the Decription");
		dc.setDecription(sc.next());
		System.out.println("Enter the Width");
		dc.setWidth(sc.nextDouble());
		System.out.println("Enter the Length");
		dc.setLength(sc.nextDouble());
		displayCargoDeatails(dc);

	}

	private static void displayCargoDeatails(DisplayCargoDeatails dc) {
		String res = " The Cargo deatails are :";
		res += "\n Name : " + dc.getName();
		res += "\n Decription : " + dc.getDecription();
		res += "\n Width : " + dc.getWidth();
		res += "\n Length : " + dc.getLength();
		System.out.println(res);

	}

}
