

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1 and Num2");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		swapTwoNumbers(number1,number2);
	}

	 static void swapTwoNumbers(int number1, int number2) {
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("number 1 : "+number1);
		System.out.println("number 2 : "+number2);
	}

}
