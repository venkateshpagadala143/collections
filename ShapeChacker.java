package absractDemo_Shape;

import java.util.Scanner;

public class ShapeChacker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Circle Radius");
		Circle circle = new Circle(sc.nextFloat());
		circle.getArea();
		circle.getParameter();
		System.out.println("Enter Square side");
		Square square = new Square(sc.nextFloat());
		square.getArea();
		square.getParameter();
		System.out.println("Enter Recctangle lenth and bidth ");
		Rectangle rectangle = new Rectangle(sc.nextFloat(), sc.nextFloat());
		rectangle.getArea();
		rectangle.getParameter();

	}
}
