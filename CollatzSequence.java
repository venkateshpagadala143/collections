package com.ojas;

import java.util.Scanner;

public class CollatzSequence {
	
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter your number");
			
			int num=sc.nextInt();
			findCollatz(num);
			
		}

		private static void findCollatz(int n) {
			
			
			while(n!=1){
				if(n%2==0)
				{
					n=n/2;
				}
					else{
						n=n*3+1;
						
					}
				System.out.print( n+",");
				
			}
			
		}
}