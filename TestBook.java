package com.ojas.book;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		System.out.println("Please Enter Your Book Name");
		Scanner sc=new Scanner(System.in);
	
		MyBook mybook = new MyBook();
		mybook.setTitle(sc.nextLine());
		System.out.println("The title of Boook is :"+mybook.getTitle());
		
	}

}
