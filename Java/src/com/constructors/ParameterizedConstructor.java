package com.constructors;

public class ParameterizedConstructor {
	ParameterizedConstructor(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	
		ParameterizedConstructor obj = new ParameterizedConstructor(10,30);
	}

}
