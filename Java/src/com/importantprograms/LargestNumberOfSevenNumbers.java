package com.importantprograms;
import java.util.Scanner;
public class LargestNumberOfSevenNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int largest;
	        System.out.println("Enter 7 numbers:");	  
	        largest = scanner.nextInt(); 
	        for (int i = 1; i < 7; i++) {
	            int number = scanner.nextInt();
	            if (number > largest) {
	            	largest = number;
	            }
	        }
	        System.out.println("The smallest number is: " + largest);
	        scanner.close();
	    }
	}

