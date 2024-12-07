package com.strings;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "madam";
		String str = new StringBuilder(s).reverse().toString();
		if(s.equals(str))
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
