package com.superkeyword;

public class Test {
	public static void main(String args[])
	{
		Parent obj = new Child(10);
		obj.method();
	}

}

class Parent
{
	int a = 10;
	Parent(int a)
	{
		System.out.println("parent class constructor");
		System.out.println(a);
	}
	public void method()
	{
		System.out.println("parent class method");
	}
	
}
 class Child extends Parent
 {
	 Child(int a)
	 {
		 super(70);	//calling parameterized constructor
		 System.out.println("child class constructor");	
		
		 
	 }
	public void method()
		{
		int a = 20;
		super.method(); //calling parent method
		System.out.println("child class method");
		System.out.println(super.a); //calling instance variable of parent class
		System.out.println(a);
	
		}	 
 }