package com.collections.arraylist;
import java.util.*;
public class ArrayListExample1{

	public static void main(String[] args) {	
		//adding array to the arraylist
		Integer[] arr = new Integer[] {1,2,3,4};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);

	}

}

