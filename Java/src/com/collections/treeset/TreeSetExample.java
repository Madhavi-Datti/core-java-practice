package com.collections.treeset;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(27);
		ts.add(4);
		ts.add(23);
		ts.add(39);
		ts.add(89);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.descendingSet());
		System.out.println(ts.subSet(4, 39));
		
	}

}
