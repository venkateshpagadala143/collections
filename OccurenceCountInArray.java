package com.ojas.arrays;
public class OccurenceCountInArray
{
	static int getCountArray(int[] a, int num)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == num||a[i]==-num)
			{
				count++;
			}
		}
		if(count<=1)
		{
			return -1;
			
		}
		return count;

	}

public static void main(String[] args) 
{
	int[] inputarray={1,2,3,3,5,6,7,2,5,9};
	int num=3;
	
	int a=getCountArray(inputarray, num);
	System.out.println(a);
}
}
