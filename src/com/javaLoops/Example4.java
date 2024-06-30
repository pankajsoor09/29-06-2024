package com.javaLoops;

public class Example4
{

	public static void main(String[] args) 
	{

		int studentAges[] = {10,20,19,21,17,18};
		
		for(int i = studentAges.length-1; i >= 0; i--)
		{
			if(studentAges[i] >= 18)
			{
				System.out.println("the person is major, because age is "+studentAges[i]);
				
			}
			else 
			{
				System.out.println("the pereson is minor, because age is "+studentAges[i]);
			}
		}
	}

}
