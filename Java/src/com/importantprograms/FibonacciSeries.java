package com.importantprograms;

import java.util.Scanner;

public class FibonacciSeries {
	    public static void main(String[] args) {
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter a number of series you want");
	        int num = s.nextInt();
	        int firstTerm = 0, secondTerm = 1;
	        System.out.println("Fibonacci Series till " + num + " terms:");
	        for (int i = 1; i <= num; i++) {        	
	            System.out.print(firstTerm);
	            if(i<num)
	            {
	            	 System.out.print(", ");
	            }
	            // compute the next term
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	            s.close();
	        }
	        
	    }
}
