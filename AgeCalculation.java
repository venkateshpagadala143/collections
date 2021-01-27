package _06_01_2021_collections;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculation {
	public static void main(String[] args) {

		System.out.println("please Enter your Date of Birth  format  d m yyyy");
		Scanner sc = new Scanner(System.in);
		int birthdate = sc.nextInt();
		int birthmonth = sc.nextInt();
		int birthyear = sc.nextInt();
		System.out.println(calculateAge(birthdate, birthmonth, birthyear));
	}

	private static double calculateAge(int birthdate, int birthmonth, int birthyear) {
		// it will give the current date
		LocalDate today = LocalDate.now();
		// for setting date of birth
		LocalDate birthday = LocalDate.of(birthyear, birthmonth, birthdate);
		// between method compare the both dates and giving the difference
		Period p = Period.between(birthday, today);

		int days = p.getDays();
		int months = p.getMonths();
		int years = p.getYears();
		double age = years + (0.083 * months);
		return age;

	}
}
