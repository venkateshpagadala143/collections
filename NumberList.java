package com.ojas.practice;

public class NumberList {
	public static void main(String[] args) throws NumberFormatException {

		String s = getNumberList();
		int[] nums = getIntegers(s);
		int max = getMax(nums);
		int min = getMin(nums);
		String str = " ";
		for (int i = min; i <= max; i++) {
			if (i <= max - 1) {
				str += i + ",";
			} else {
				str += i;
			}
		}
		System.out.println(str);

	}

	private static int getMin(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max > nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	private static int getMax(int[] nums) {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (min < nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}

	private static int[] getIntegers(String s) {
		String s1 = s.trim();
		System.out.println(s);
		String[] s2 = s1.split(",");
		int[] num = new int[s2.length];

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(s2[i]);

		}

		return num;
	}

	private static String getNumberList() {
		String s = "1,2,3,4,5-8,6-10,8-15,16-25,20-30,22-26";
		String[] num = s.split(",");

		String ns = " ";
		for (int i = 0; i < num.length; i++) {

			if (num[i].length() >= 2) {

				String s1 = num[i];

				String[] num1 = s1.split("-");
				for (int j = 0; j < num1.length; j++) {

					ns += num1[j] + ",";

				}
			} else {

				ns += num[i] + ",";

			}

		}

		return ns;
	}

}
