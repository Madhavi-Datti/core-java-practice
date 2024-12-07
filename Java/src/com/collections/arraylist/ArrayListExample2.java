package com.collections.arraylist;
import java.util.*;

public class ArrayListExample2  {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		//adding elements to the arraylist
		al.add("mad");
		al.add("mad");
		al.add("madhu");
		al.add("madhavi");
		al.add("datti");
		System.out.println(al);
		//retriving elements from the arraylist
		System.out.println(al.get(3));
		
		//updating elements in the list
		
		al.set(1, "maddy");
		System.out.println(al);
		
		//deleting element from the list
		
		al.remove(0);
		System.out.println(al);
		
		//verification of elements in the list
		System.out.println(al.contains("madhavi"));
		
		//traversing of elements in the list
		
		Iterator<String> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
