package com.exceptionhandling;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			m(97);
		}
		
		catch(CustomException e)
		{
			System.out.println(e);
		}
	}
	
 public static void m(int age) throws CustomException
 {
	 if(age<18)
	 {
		 throw new CustomException("");
	 }
	 else
	 {
		 System.out.println("eligible");
	 }
 }
}
class CustomException extends Throwable
{

	public CustomException(String a) {
		super("not eligible");
	}
	
}
