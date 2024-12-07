package com.strings;
import java.util.*;
public class UpperCaseToLowerCase {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String name = scanner.nextLine();
	        String swappedString = "";

	        for (int i = 0; i < name.length(); i++) {
	            char c = name.charAt(i);
          char swappedChar = Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
           swappedString = swappedChar+swappedString;
	        }
	        System.out.println("Swapped case string:\n" + swappedString);
	        scanner.close();
	    }
	}	    

