package com.collections.vector;
import java.util.*;
public class VectorPractice1 {
		public static void main(String[] args) {
			//adding array to the vector
			Integer[] arr = new Integer[] {1,2,3,4};
			 Vector<Integer> v = new Vector<>(Arrays.asList(arr)); 
			 v.add(1); 
			 v.add(2); 
			 v.add(3);
			 v.add(5); 
			 System.out.println(v);

}}