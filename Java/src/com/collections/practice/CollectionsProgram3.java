//Split given list into two lists 
package com.collections.practice;
import java.util.*;
public class CollectionsProgram3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		System.out.println("Size of list is: ");
		int n = s.nextInt();
		System.out.println("elements in the list");
		for(int i=0;i<n;i++)
		{
			int element = s.nextInt();
			l.add(element);	
		}
		System.out.println(l.subList(0,n/2));
		System.out.println(l.subList(n/2, n));
		s.close();		
	}
}
