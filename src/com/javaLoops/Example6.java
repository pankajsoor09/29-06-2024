package com.javaLoops;

public class Example6
{

	public static void main(String[] args)
	{

		int studentAges[] = {10,20,19,21,17,18};
		
		for(int i = 0; i < studentAges.length ; i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(studentAges[i]);
		}
	}

}
