package com.streams;
import java.util.*;

public class StreamsExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("rose");
		al.add("lilly");
		al.add("jasmine");
		al.add("lotus");
		al.stream().forEach(obj-> System.out.println(obj));
	}

}
