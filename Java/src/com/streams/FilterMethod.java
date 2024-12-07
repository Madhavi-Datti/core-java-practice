package com.streams;

import java.util.*;

public class FilterMethod {

	public static void main(String[] args) {
		List<Integer> l= new ArrayList<>();
		l.add(20000);
		l.add(30000);
		l.add(45000);
		l.add(50000);
		l.add(15000);
		
//Predicate<Integer> p = new  Predicate<Integer>() {
	
//	@Override
//	public boolean test(Integer salary) {
//		
//		return salary>20000;
//	}
//};
//System.out.println(p.test(35000));
	
l.stream().filter(salary -> salary>=30000).forEach(salary -> System.out.println(salary));
	}
}
