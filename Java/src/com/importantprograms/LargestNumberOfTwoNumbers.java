package com.importantprograms;
import java.util.Scanner;
	public class LargestNumberOfTwoNumbers {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the first number: ");
			int num1  = s.nextInt();
			System.out.print("Enter the second number: ");
			int num2 = s.nextInt();
			s.close();
			int largeNumber = (num1>num2)?num1:num2;
			System.out.println("The largest number is: " + largeNumber);

		}
	}
	
	/* finding large number using if-else statements
	 public class LargestNumberOfTwoNumbers {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int num1  = s.nextInt();
	System.out.print("Enter the second number: ");
	int num2 = s.nextInt();
	s.close();
	int largest;
	if (num1 > num2) {
        System.out.println("The largest number is: " + num1);
    } else  {
        System.out.println("The largest number is: " + num2);
    } 
    }}*/
	