

import java.util.Scanner;

public class AddFourNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
 addFourNumber(num1,num2,num3,num4);
	}

	private static void addFourNumber(int num1, int num2, int num3, int num4) {
		int number1=num1+num2;
		int number2=num3+num4;
		int sum=number1+number2;
		System.out.println(sum);
		
	}

}
