//Finding Sum and Average of given List
package com.collections.practice;
import java.util.*;
public class CollectionProgram1 {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Integer> list = new ArrayList<>();
		        System.out.print("Enter total number of elements: ");
		        int n = scanner.nextInt();
		        int sum = 0;
		        System.out.println("Enter " + n + " integers:");
		        for (int i = 0; i < n; i++)
		        {
		            int element = scanner.nextInt();
		            list.add(element);
		        }
		        for(int i=0;i<list.size();i++)
		        {
		        	sum+=list.get(i);
		        }
		        System.out.println(sum);
		        System.out.println(sum/n);
		        scanner.close();
	}
}
