package com.statickeyword;

public class StaticKeyword {
	static int a = 10;      //static variable
	static void display()   //outer static method
	{
		System.out.println("static method");
	}
	static                      //static block
	{
		System.out.println("static block");
	
	}
	public static void main(String[] args) {
	System.out.println(a);
	display();
	
	// for nested non-static we need to create object for calling method
	StaticKeyword.StaticNested obj = new StaticKeyword.StaticNested();
	obj.display1(); 
	
	//for static nested class methods we no need to create an obj
	StaticKeyword.StaticNested.display(); 
	}
	static class StaticNested {
		public static void display() {  
            System.out.println("nested static method");
        }
		public static void display1() {  
            System.out.println("nested non-static method");
        }
	}
           
	}
