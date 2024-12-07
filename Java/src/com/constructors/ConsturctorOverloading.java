package com.constructors;

public class ConsturctorOverloading {
	ConsturctorOverloading()
	{
		System.out.println("default constructor");
	}
	ConsturctorOverloading(int a, int b)
	{
		System.out.println("parameterized constructor");
		System.out.println(a+b);
	}
	ConsturctorOverloading(String name)
	{
		System.out.println("no-arg constructor");
		System.out.println("constructor overloading");
	}

	public static void main(String[] args) {
		ConsturctorOverloading obj = new ConsturctorOverloading();
		ConsturctorOverloading obj1 = new ConsturctorOverloading(10,20);
		ConsturctorOverloading obj2 = new ConsturctorOverloading("madhu");
	}

}
