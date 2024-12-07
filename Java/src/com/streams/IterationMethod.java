package com.streams;
import java.util.*;
import java.util.stream.Stream;
public class IterationMethod {
	public static void main(String[] args) {
	Stream.iterate(1, n->n+1).limit(10).forEach(n -> System.out.println(n));
//		UnaryOperator<Integer> u = new UnaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer n) {
//				// TODO Auto-generated method stub
//				return n+1;
//			}
//		};
//		System.out.println(u.apply(10));
//		Stream.iterate(0, u).limit(10).forEach(n -> System.out.println(n));

	}

}
