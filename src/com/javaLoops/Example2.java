package com.javaLoops;

public class Example2
{

	public static void main(String[] args)
	{
    int studentAges[] = {12,27,19,23,16,18};
    
    //for loop
    
    for(int i = 0; i < studentAges.length ; i++)
    {
    	if(studentAges[i] >= 18)
    	{
    		System.out.println("the pwerson is major because age is"+studentAges[i]);
    		
    	}
    	else
    	{
    		System.out.println("the person is minor because age is"+studentAges[i]);
    	}
    }
    
	}

}
