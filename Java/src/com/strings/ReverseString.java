package com.strings;

public class ReverseString {

	public static void main(String[] args) {
//		String s= "Hello, World!";
//		StringBuilder sb = new StringBuilder(s).reverse();
//		System.out.println(sb);
		
		String s="Madhu is a good Girl";
		String revString = "";
		for (int i=0; i<s.length(); i++)
	      {
	        char c= s.charAt(i);
	        revString = c+revString;
	      }
	        System.out.println(revString);
}
}


