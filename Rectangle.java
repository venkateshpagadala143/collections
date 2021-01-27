package com.ojas;

import java.util.Scanner;

public class Rectangle {
	private int x1, x2, y1, y2, width, hight;
	String res = "";

	Rectangle(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	Rectangle(int width, int high) {
		this.width = width;
		this.hight = high;
	}

	void Area() {
		int area = hight * width;

		res += "\n The Area of Rectangular is : " + area;
	}

	void Parameter() {
		int parameter = 2 * (hight + width);

		res += "\n The Parameter : " + parameter;

	}

	void getPointsInside(int deltax, int deltay) {

		if (deltax > x1 && deltax < x2 && deltay > y1 && deltay < y2) {

			res += "\n (" + deltax + "," + deltay + ") : points are inside the Trainlgle ";
		} else {

			res +="\n points are outside the Triangle";
		}

	}

	void move(int deltax, int deltay)

	{
		x1 = deltax;
		y1 = deltay;
		x2 = width + x1;
		y2 = hight + y1; 

		res +="\n After moved (0,0) To (" + deltax + "," + deltay + ")  \n x1 is :" + x1 + "\n y1 is :" + y1
				+ "\n x2 is :" + x2 + "\n y2 is :" + y2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Length and Width");
		int length = sc.nextInt();
		int width = sc.nextInt();

		Rectangle rec = new Rectangle(length,width);
		rec.x1 = 0;
		rec.y1 = 0;

		rec.x2 = rec.width + rec.x1;
		rec.y2 = rec.hight + rec.y1;
		System.out.println("The Rectangle lower left corner : (" + rec.x1 + "," + rec.y1 + ")");
		System.out.println("The Rectangular upper right corner is : (" + rec.x2 + "," + rec.y2 + ")");
		rec.Area();
		rec.Parameter();
		rec.getPointsInside(8, 12);
		rec.move(10, 12);
		Rectangle rec1 = new Rectangle(rec.x1, rec.x2, rec.y1, rec.y2);
		System.out.println(rec.res);

	}

}
