package com.collections.arraydeque;
import java.util.*;
public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		//Adding elements
		ad.addFirst("Lotus");
		ad.add("Jasmine");
		ad.addLast("Rose");
		ad.offer("Hibiscus");
		ad.offerFirst("Chamomile");
		ad.offerLast("Sunflower");
		System.out.println(ad);
		
		//Retriving elements
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		//Deleting elements
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);	
		
		//verification of elements
		System.out.println(ad.contains("Rose"));
		
		//traversing of elements
//		Iterator i = ad.iterator();
//		while(i.hasNext())
//		{
//		System.out.println(i.next());
//		}
		while(!ad.isEmpty())
		{
			System.out.println(ad.poll());
		}
	}
}
