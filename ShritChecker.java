package InhertitDemo1;

import java.util.Scanner;

public class ShritChecker extends Shirt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to OJAS Tailaring ");
		System.out.println("please Select a meterial" + "\n" + "1.Cotton" + "\n" + "2.Linen" + "\n" + "3.Polyster");
		int option = sc.nextInt();
		System.out.println("please Enter your collerSize and length");
		float collerSize = sc.nextFloat();
		float length = sc.nextFloat();
		switch (option) {
		case 1:
			Shirt shrt = new Shirt(collerSize, length, String.valueOf(Meterial.COTTON));
			shrt.displayDetails();
			break;
		case 2:
			Shirt shrt1 = new Shirt(collerSize, length, String.valueOf(Meterial.LINEN));
			shrt1.displayDetails();
			break;
		case 3:
			Shirt shrt2 = new Shirt(collerSize, length, String.valueOf(Meterial.POLISTER));
			shrt2.displayDetails();
			break;

		}

	}
}