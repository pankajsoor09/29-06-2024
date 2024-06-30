package com.javaLoops;

public class Example1 {

	public static void main(String[] args) {
		
		int studentAges[] = {10, 20, 19, 21, 17, 18};
		
		
		boolean condition = (studentAges[0] >= 18);
		
		System.out.println(condition);
		
		if(condition)
		{
			System.out.println("the person is major");
		}
		
		System.out.println("------------------------------");
		
		System.out.println(studentAges.length);
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < studentAges.length ; i++)
		{
			if(studentAges[i] >= 18)
			{
				System.out.println("the person is major, bcz age is "+studentAges[i]);
			}	
			else
			{
				System.out.println("the person is minor, bcz age is "+studentAges[i]);
				
			}
			
		}
		
	}

}
