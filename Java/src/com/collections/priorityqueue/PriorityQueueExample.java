package com.collections.priorityqueue;
import java.util.*;
public class PriorityQueueExample {
		public static void main(String[] args) {
			Queue<String> pq = new PriorityQueue<>();
//			For highest element - highest priority use comparator
//			Queue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
			
			//adding elements
			pq.offer("mango");
			pq.add("apple");
			pq.offer("pinapple");
			pq.offer("banana");
			pq.add("orange");
			pq.offer("pinapple");
			pq.add("guava");
			System.out.println(pq);
	
			//Retriving the head element
			System.out.println(pq.peek());
			System.out.println(pq);
			
			//deleting the head element
			System.out.println(pq.poll());
			System.out.println(pq.remove());
			System.out.println(pq);
			
			//verification of elements
			System.out.println(pq.contains("banana"));
			
			//traversing of elements
			while(!pq.isEmpty())
			{
				System.out.println(pq.poll()); 
			} 
		}

	}

