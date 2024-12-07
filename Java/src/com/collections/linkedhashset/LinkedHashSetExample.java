package com.collections.linkedhashset;
import java.util.*;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		//creation of set
		Set<Integer> lhs = new LinkedHashSet<>();
		//adding elements
		lhs.add(10);
		lhs.add(20);
		lhs.add(null);
		lhs.add(30);
		lhs.add(30);
		lhs.add(40);
		System.out.println(lhs);
		//verification	
		System.out.println(lhs.contains(30));
		//deletion
		System.out.println(lhs.remove(40));
		System.out.println(lhs);
		//Traversing of elements
		for(Integer i:lhs)
		{
			System.out.println(i);
		}

	}

}