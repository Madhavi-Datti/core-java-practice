package com.collections.hashset;
import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		//creation of set
		Set<Integer> hs = new HashSet<>();
		//adding elements
		hs.add(10);
		hs.add(20);
		hs.add(null);
		hs.add(30);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		//verification	
		System.out.println(hs.contains(30));
		//deletion
		System.out.println(hs.remove(40));
		System.out.println(hs);
		//Traversing of elements
		for(Integer i:hs)
		{
			System.out.println(i);
		}

	}

}
