package com.collections.stack;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		//adding elements into the stack
		s.push("mad");     //0 - 4
		s.push("maddy");  	 //1 - 3
		s.push("madhu"); 	 //2 - 2
		s.push("madhavi");     //3 - 1
		//search for an element(1 - based index)
		System.out.println(s.search("maddy"));
		// find the index of element
		System.out.println(s.indexOf("maddy"));
		//Retrieves the element at the top of the stack without removing it.
		System.out.println(s.peek());
		System.out.println(s);
		//Removing the element from the top of the stack.
		System.out.println(s.pop());
		System.out.println(s);
		//check the stack is empty or not
		System.out.println(s.empty());
		//Return the number of elements in the stack.
		System.out.println(s.size());
		
		for(String i:s)
		System.out.println(i);	
	}
}
