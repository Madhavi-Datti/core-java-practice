package com.patterns;

public class Pattern12 {

	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 1; j <=i; j++) {
                
            	if(i>=2&&j<=i-1)
            			System.out.print(" ");
            }
            // Print a single star
            System.out.println("*");
	}}

	}
