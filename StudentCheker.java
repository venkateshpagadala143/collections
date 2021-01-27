package InheritDemo;

import java.util.Scanner;

public class StudentCheker extends Hosteller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please select " + "\n" + "1.DeyScholor" + "\n" + "2.Hosteller");
		int selection = sc.nextInt();
		System.out.println("please Enter your Id   Name ");
		if (selection == 1) {
			DayScholler days = new DayScholler();
			DayScholler dsc = new DayScholler(sc.nextInt(), sc.next(), days.examfee, days.transportFee);
			dsc.Display();
			payment(sc);

		} else if (selection == 2) {
			Hosteller hsts = new Hosteller();
			Hosteller hst = new Hosteller(sc.nextInt(), sc.next(), hsts.examfee, hsts.hostelFee);
			hst.Display();
		}
	}

	private static void payment(Scanner sc) {
		System.out.println("please pay the Fee");
		double fee = sc.nextInt();
		double fees = examfee + transportFee;

		if (fee == fees) {
			System.out.println("Thank you");
		} else if (fee < fees) {
			fees = fees - fee;
			System.out.println("Please pay reamining Fee " + fees);
		} else {
			fees = fee - fees;
			System.out.println("hear is your Extra payment " + fees);
		}

	}
}
