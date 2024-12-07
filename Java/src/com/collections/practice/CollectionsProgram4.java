package com.collections.practice;
import java.util.*;
public class CollectionsProgram4 {
	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				List<Integer> l1 = new ArrayList<>();
				System.out.println("Size of list1 is: ");
				int n1 = s.nextInt();
				System.out.println("elements in the list1");
				for(int i=0;i<n1;i++)
				{
					int element = s.nextInt();
					l1.add(element);	
				}
				List<Integer> l2 = new ArrayList<>();
				System.out.println("Size of list2 is: ");
				int n2 = s.nextInt();
				System.out.println("elements in the list2");
				for(int i=0;i<n2;i++)
				{
					int element = s.nextInt();
					l2.add(element);	
				}
				l1.addAll(l2);
				System.out.println(l1);
				s.close();		
			}

}
