package com.exceptionhandling;
import java.io.*;
public class ExceptionHandling {
//Stack trace
//exception name - java.lang.ArithmeticException
//exception message - / by zero
//which line 
//method info - main
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("started");
		int a = 10;
		int b = 0;
		int c;
		File file = new File("D:resume.doc");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		
		try {
		c = a/b;
		}
		catch(ArithmeticException ae)
		{
		System.out.println(ae);	
		}
		try {
		throw new FileNotFoundException("device error");
		}
		catch(Exception ae)
		{
		System.out.println(ae);	
		}

		finally
		{
			System.out.println("finally block");
		}
	}

}
