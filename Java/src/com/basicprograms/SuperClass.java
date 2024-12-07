package com.basicprograms;

public class SuperClass {
	@Override
	public String toString()
	{
		return "Madhavi";
		
	}
	

	public static void main(String[] args) {
		
		SuperClass obj = new SuperClass();
		System.out.println(obj.hashCode());

	}

}
