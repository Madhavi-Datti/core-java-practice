package com.exceptionhandling;
public class ThrowKeyword1 {
	public static void main(String[] args) {
		try
		{
			throw new User("exception");
		}
		catch(User e)
		{
			System.out.println(e);
		}
	}
	}	
	class User extends Exception
	{
		public User(String s) {
			super(s);
		}
		
	}
