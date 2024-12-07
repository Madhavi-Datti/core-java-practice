package com.importantprograms;
import java.util.Scanner;
public class SmallestNumberofTwoNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        scanner.close();
	        int smallest;
	        if (num1 < num2) {
	            smallest = num1;
	        } else {
	            smallest = num2;
	        }
	        System.out.println("The smallest number using if-else is: " + smallest);
}
}