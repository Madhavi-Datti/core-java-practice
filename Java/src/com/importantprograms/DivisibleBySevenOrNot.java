package com.importantprograms;
import java.util.Scanner;
public class DivisibleBySevenOrNot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        // Check if the number is divisible by 7
	        if (number % 7 == 0) {
	            System.out.println(number + " is divisible by 7.");
	        } else {
	            System.out.println(number + " is not divisible by 7.");
	        }
	        
	    }
	}
