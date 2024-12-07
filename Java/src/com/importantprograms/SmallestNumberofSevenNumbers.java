package com.importantprograms;
import java.util.Scanner;
public class SmallestNumberofSevenNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int smallest;
	        System.out.println("Enter 7 numbers:");	  
	        smallest = scanner.nextInt(); 
	        for (int i = 1; i < 7; i++) {
	            int number = scanner.nextInt();
	            if (number < smallest) {
	                smallest = number;
	            }
	        }
	        System.out.println("The smallest number is: " + smallest);
	        scanner.close();
	    }
	}
