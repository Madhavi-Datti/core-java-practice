package com.constructors;

public class NoArgumentConstructor {
	
	NoArgumentConstructor()
	{
		System.out.println("its a default constructor");
	}
	NoArgumentConstructor(String arg)
	{
		System.out.println("its a No-Argument Constructor");
	}
	public static void main(String[] args) {
		
		NoArgumentConstructor obj = new NoArgumentConstructor();
		NoArgumentConstructor obj1 = new NoArgumentConstructor("");
	}

}
