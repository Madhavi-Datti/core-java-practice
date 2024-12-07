package com.collections.vector;
import java.util.*;
public class VectorPractice {
	public static void main(String[] args) {
		Integer[] a = new Integer[] {10,20,30};
		 Vector<Integer> v = new Vector<>(Arrays.asList(a)); 
		 v.add(1); 
		 v.add(2); 
		 v.add(3);
		 v.add(5); 
		 System.out.println(v);
		 //Iterating using Enumeration interface
//		 Enumeration<Integer> e = v.elements();
//		 while(e.hasMoreElements())
//		 {
//			 System.out.println(e.nextElement());
//		 }
		 
		 //Iterating using Iterator interface
//		 Iterator<Integer> i = v.iterator();
//		 while(i.hasNext())
//		 {
//			 System.out.println(i.next());
//		 }
		 
		 //Iterating using for each loop
		 for(Integer i:v)
		 {
			 System.out.println(i); 
		 }

}}