package com.importantprograms;

import java.util.Scanner;

public class FbSeriesValues {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the position of the Fibonacci series: ");
	        int n = scanner.nextInt();

	        int first = 0, second = 1;
	        
	        // Directly return if n is 0 or 1
	        if (n == 0) {
	            System.out.println("Fibonacci number at position 0 is: 0");
	        } else if (n == 1) {
	            System.out.println("Fibonacci number at position 1 is: 1");
	        } else {
	            for (int i = 2; i <= n; i++) {
	                int next = first + second;
	                first = second;
	                second = next;
	            }
	            System.out.println("Fibonacci number at position " + n + " is: " + second);
	        }
	        
	        scanner.close();
	    }
	}


