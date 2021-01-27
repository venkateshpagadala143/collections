package com.String;

import java.util.Scanner;

public class FindDuplcatesinArr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your array Size");
	int size = sc.nextInt();
	System.out.println("Enter your Array Elements");
	int[] inputArr = new int[size];
	for (int i = 0; i < size; i++) 
	{
		inputArr[i] = sc.nextInt();
	}
	System.out.println("print Array");
	for (int i = 0; i < inputArr.length; i++) 
	{
		System.out.println(inputArr[i]);
	}
	findDuplicate(inputArr);
}

private static void findDuplicate(int[] inputArr) {
	for(int i=0;i<inputArr.length;i++) {
		for(int j=i+1;j<inputArr.length;j++) {
			if(inputArr[i]==inputArr[j]) {
				System.out.println("duplicate elements are : "+inputArr[j]);
				inputArr[i]=0;
			}
		}
	}
	
}
}
