package com.importantprograms;
import java.util.Scanner;
public class FactorialCalculation {
		    // Method to calculate factorial
		    public int calculateFactorial(int num) {
		        int factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }
		        return factorial;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number to calculate its factorial: ");
		        int number = scanner.nextInt();
		        scanner.close();
		       // Use an anonymous object to calculate the factorial
		       int result = new FactorialCalculation().calculateFactorial(number);
		       System.out.println(result);
		       }  
		}
