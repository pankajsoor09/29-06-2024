package com.javaLoops;

public class Example3 
{

	public static void main(String[] args) 
	{

	 int studentAges[] = {10,20,19,21,17,18};
	 
	 for (int studentAge : studentAges ) // enhanced for loop
	 {
		 if (studentAge  >= 18)
		 {
			 System.out.println("the person is major,because age is "+ studentAge);
		 }
		 else 
		 {
			 System.out.println("the person is minor,because age is "+ studentAge);
			 
		 }
	 }
	}

}
