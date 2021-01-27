package com.String;

import java.util.Scanner;

public class PrintOvels {
	public static void main(String[] args) 
	{
		System.out.println("Enter your any Name ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		getOvels(name);
		againGetOvels(name);
	}

	private static void againGetOvels(String name)
	{
		String ovels="";
		char[]ch=name.toCharArray();
		for(int i=0;i<name.length();i++) 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
					||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') 
			{
				//for printing String 
				ovels+=ch[i];
				//for printing characters
				System.out.println(ch[i]);
				
			}
		}
		//for printing ovels String 
		System.out.println(ovels);
		
	}

	private static void getOvels(String name) 
	{
		
		char[] capsovels = { 'A', 'E', 'I', 'O', 'U' };
		char[] smallovels= {'a','e','i','o','u'};
		for (int i = 0; i < name.length(); i++) 
		{
			for (int j = 0; j < capsovels.length; j++)
			{
				if (name.charAt(i) == (capsovels[j])||name.charAt(i)==smallovels[j])
				{
					System.out.println(name.charAt(i));
				}
				

			}
		}

	}
}
