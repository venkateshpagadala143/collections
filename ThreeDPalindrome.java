

import java.util.Scanner;

public class ThreeDPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		checkPalindrome(number);
	}

 static void checkPalindrome(int number) {
	int  revnumber=reverseNumber(number);
	if(number==revnumber) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
		
		
	}

 static int reverseNumber(int number) {
	 int revNumber=0;
	while(number!=0) {
		int rem=number%10;
		revNumber=revNumber*10+rem;
		number=number/10;
		
	}
	return revNumber;
	
}
}
