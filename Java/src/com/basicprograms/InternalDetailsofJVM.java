package com.basicprograms;

public class InternalDetailsofJVM {
	    public static void main(String[] args) {
	        // Print a message to the console
	        System.out.println("Internal Details of JVM");
	        // Create an object of InternalDetailsofJVM
	        InternalDetailsofJVM obj = new InternalDetailsofJVM();
	        // Call a method to display a message
	        obj.displayMessage();
	        // Make obj eligible for garbage collection
	        obj = null;
	        // Suggest garbage collection
	        System.gc();
	    }
	    // Method to display a message
	    public void displayMessage() {
	        System.out.println("This is a simple JVM demo.");
	    }
	    // Override finalize method to demonstrate garbage collection
	    //finalize method is defined in the java.lang.Object 
	    @Override
	    protected void finalize() {
	        System.out.println("Object is being garbage collected.");
	    }}
