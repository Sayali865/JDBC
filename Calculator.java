package com.demo;

//POJO - plain old java object

public class Calculator {

	public int add(int a, int b)
	{
		int result = a+b;
		return result;
	}
	
	public int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		
		return max;
		
	}
}
