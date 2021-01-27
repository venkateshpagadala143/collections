package _01_04_2021_collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Dates Format in   yyyy-MM-dd");
		String date1 = sc.next();
		String date2 = sc.next();
		System.out.println(compareDates(date1, date2));

	}

	private static int compareDates(String date1, String date2) {
		SimpleDateFormat sdfo = new SimpleDateFormat("yyyy-MM-dd");
		// we can give below format also
		// SimpleDateFormat sdfo=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date dat1 = sdfo.parse(date1);
			Date dat2 = sdfo.parse(date2);
			System.out.println("Date1 : " + sdfo.format(dat1));
			System.out.println("Date2 : " + sdfo.format(dat2));

			if (dat1.compareTo(dat2) > 0) {

				return 2;
			}

			else if (dat1.compareTo(dat2) < 0) {
				return 1;
			}

			else if (dat1.compareTo(dat2) == 0) {
				return 0;
				
			}
		} catch (ParseException e) {
			System.out.println("Please Enter the Date Format Correctly");
		}
		return -1;

	}
}
