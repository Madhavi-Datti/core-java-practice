//Finding the sum of even numbers in the list
package com.collections.practice;
import java.util.*;
public class CollectionsProgram2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("enter  size of list");
		int size = s.nextInt();
		int sum = 0;
		System.out.println("enter elements in the list");
		for(int i = 0;i<size;i++)
		{
		int element = s.nextInt();
		al.add(element);
		}
		for(int i1:al)
		{
			if(i1%2==0)
				sum+=i1;
		}
		System.out.println(sum);
		s.close();	
	}
}
