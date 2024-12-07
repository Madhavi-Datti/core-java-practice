package com.constructors;

public class CopyConstructorAndChaining {
	    String name;
	    int age;
	    // Default constructor
	    public CopyConstructorAndChaining() {
	        this("madhu",39); // Constructor chaining to the parameterized constructor
	        System.out.println("Default constructor called");
	    }
	    // Parameterized constructor
	    public CopyConstructorAndChaining(String name, int age) {
	       this.name = name;
	       this.age = age;
	        System.out.println("Parameterized constructor called");
	    }
	    // Copy constructor
	    public CopyConstructorAndChaining(CopyConstructorAndChaining other) {
	        this(other.name, other.age); // Constructor chaining to the parameterized constructor
	        System.out.println("Copy constructor called");
	    }
	    // Method to display person details
	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	    public static void main(String[] args) {
	        // Creating objects using different constructors
	    	CopyConstructorAndChaining person1 = new CopyConstructorAndChaining(); // Calls the default constructor
	        person1.display();
	        CopyConstructorAndChaining person2 = new CopyConstructorAndChaining("Alice", 30); // Calls the parameterized constructor
	        person2.display();
	        CopyConstructorAndChaining person3 = new CopyConstructorAndChaining(person2); // Calls the copy constructor
	        person3.display();
	    }
	}
