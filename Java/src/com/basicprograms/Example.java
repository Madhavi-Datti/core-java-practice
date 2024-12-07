package com.basicprograms;

public class Example {
	    // Constructor that takes an Example object as a parameter
	    Example(Example obj) {
	        System.out.println("Constructor12 is invoked with an Example object");
	        // You can access obj's fields and methods here
	    }
	    
	    // Constructor that doesn't take any parameters
	    Example() {
	        // Calls the other constructor, passing the current object
	        new Example(this);
	        System.out.println("Constructor23 is invoked with an Example object");
	    }
	    
	    public static void main(String[] args) {
	        // Creating an instance of Example, which will trigger the constructors
	        Example example = new Example();
	    }
	}

