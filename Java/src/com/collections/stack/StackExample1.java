package com.collections.stack;
import java.util.*;
public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		for(Integer i:s)
		System.out.println(i);

	}

}
