package com.String;

import java.util.Scanner;

public class StepNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		
		System.out.println(isStepNumber1(number));
	}

	private static boolean isStepNumber1(int number)
	{
		String num=String.valueOf(number);
		char []ch=num.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			int firstNum=Character.getNumericValue(ch[i]);
			int secondNum=Character.getNumericValue(ch[i+1]);
			
			if(firstNum-secondNum!=1&&firstNum-secondNum!=-1) 
			{
				
				return false;
			}
			
		}
		return true;
		
	}

	
	}


