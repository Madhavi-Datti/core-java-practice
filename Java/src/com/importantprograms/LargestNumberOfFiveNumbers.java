package com.importantprograms;
import java.util.Scanner;
//Find the largest number using conditional (ternary) operator
public class LargestNumberOfFiveNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter five numbers:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();
	        int num4 = scanner.nextInt();
	        int num5 = scanner.nextInt();
	        scanner.close();
	        int largest = (num1 > num2) ? num1 : num2;
	        largest = (largest > num3) ? largest : num3;
	        largest = (largest > num4) ? largest : num4;
	        largest = (largest > num5) ? largest : num5;
	        System.out.println("The largest number is: " + largest);
	    }
	}

/* Using If-statement
 import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        scanner.close();
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }
        System.out.println("The largest number is: " + largest); 
    }
}

 */

