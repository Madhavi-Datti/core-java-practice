package com.importantprograms;
import java.util.Scanner;
public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter given number");
		int num = s.nextInt();
		s.close();
		int originalNumber = num;
		int reverseNumber=0;
		while (num!=0) {
            int reminder = num%10;
            reverseNumber = reverseNumber*10+reminder;
            num = num/10;
        }
		 if (originalNumber == reverseNumber) {
	            System.out.println(originalNumber+" is a palindrome.");
	        } else {
	            System.out.println(originalNumber+" is not a palindrome.");
	        }
	}
}
