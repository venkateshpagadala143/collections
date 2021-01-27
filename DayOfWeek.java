package _29_12_02020_IOStream;

import java.util.Scanner;

public class DayOfWeek {
	String dayName;
	String shortDayName[] = { "SUN", "MON", "TUE", "WEN", "THU", "FRI", "SAT" };
	String longDayName[] = { "sunday", "monday", "tuesday", "wenesday", "thursday", "friday", "saturday" };
	static int indexValue;

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {

		for (int index = 0; index < shortDayName.length; index++) {

			if (shortDayName[index].equalsIgnoreCase(dayName) || longDayName[index].equalsIgnoreCase(dayName)) {
				this.dayName = shortDayName[index];
				indexValue = index;
			}
		}

	}

	private static void getPreviousDay(DayOfWeek dow) {

		if (indexValue == 0) {
			System.out.println("The previous day is : " + dow.shortDayName[6]);
		} else {
			System.out.println("The previous day is : " + dow.shortDayName[indexValue - 1]);
		}

	}

	private static void getNextday(DayOfWeek dow) {

		if (indexValue == 6) {
			System.out.println("The next day is : " + dow.shortDayName[0]);
		} else {
			System.out.println("The next day is : " + dow.shortDayName[indexValue + 1]);
		}

	}

	public static void main(String[] args) {
		System.out.println("please Enter a day name");
		Scanner sc = new Scanner(System.in);

		DayOfWeek dow = new DayOfWeek();
		dow.setDayName(sc.next());
		getNextday(dow);
		getPreviousDay(dow);
		System.out.println("please Enter how many days you want Enter to current day");
		int noOfDays = sc.nextInt();
		addToCurrentDay(dow, noOfDays);

	}

	private static void addToCurrentDay(DayOfWeek dow, int noOfDays) {
		noOfDays = indexValue + noOfDays;
		noOfDays = noOfDays % 7;
		if (noOfDays < 0) {
			noOfDays = noOfDays + 7;
			System.out.println("The Day is :" + dow.shortDayName[noOfDays]);
		} else {
			System.out.println("The Day is : " + dow.shortDayName[noOfDays]);

		}

	}

}
