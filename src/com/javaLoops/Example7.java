package com.javaLoops;

public class Example7 
{

	public static void main(String[] args)
	{
		int studentAges[] = {10, 20, 19, 21, 17, 18};

		int i = 0;//initialization

		//condition
				while(i < studentAges.length)
				{
					
					if(studentAges[i] >= 18)
					{
						System.out.println("the person is major, bcz age is "+studentAges[i]);
					}	
					else
					{
						System.out.println("the person is minor, bcz age is "+studentAges[i]);
						
					}
					
					i++;
					
	}

}
	
}
