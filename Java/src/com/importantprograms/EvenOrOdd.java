package com.importantprograms;
// Determine if the number is even or odd using the conditional operator
import java.util.Scanner;
public class EvenOrOdd {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
	        System.out.println(result);
	    }
	}

/*Check if the number is even or odd using If-Else Statement and the modulus operator
import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }   
    }
}
*/