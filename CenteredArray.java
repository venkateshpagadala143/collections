package com.ojas.coding;

import java.util.Scanner;

public class CenteredArray {
	public static void main(String[] args) {
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		for (int insert = 0; insert < size; insert++) {
			numbers[insert] = sc.nextInt();
		}
	findCenteredArray(numbers);
	}

	private static void findCenteredArray(int[] numbers) {
		if(numbers.length%2==0) {
		int middleIndex=numbers.length/2;
		int middleValue=(numbers[middleIndex]+numbers[middleIndex-1])/2;
		System.out.println("The Middle element is :"+middleValue);
		}else
		{
				int middleIndex=numbers.length/2;
				System.out.println("The Middle element is :"+numbers[middleIndex]);
				
			
		}
			
			
		}
		
	}


