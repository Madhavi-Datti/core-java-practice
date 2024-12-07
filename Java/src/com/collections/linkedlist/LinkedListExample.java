package com.collections.linkedlist;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("m");
		al.add("a");
		LinkedList<String>ll = new LinkedList<>();
		//adding elements to the LinkedList
				ll.add("d");
				ll.add("h");
				ll.add("a");
				ll.add("v");
				ll.add("i");
				ll.add("D");
				ll.addAll(0,al);
				System.out.println(ll);
				//retriving elements from the LinkedList
				System.out.println(ll.get(7));
				
				//updating elements in the list
				
				ll.set(0, "M");
				System.out.println(ll);
				
				//deleting element from the list
				
				ll.remove(7);
				System.out.println(ll);
				
				//verification of elements in the list
				System.out.println(ll.contains("m"));
				
				//traversing of elements in the list
				
				Iterator<String> i = ll.iterator();
				while(i.hasNext())
				{
					System.out.print(i.next());
				}

			}
	}

