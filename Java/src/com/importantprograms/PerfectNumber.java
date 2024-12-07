package com.importantprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		s.close();
		int sumOfDivisors = 0;
		for(int i=1; i<num;i++) {
			if(num%i==0)
			{
				sumOfDivisors=i+sumOfDivisors; 
			}
		}
		if(sumOfDivisors==num)
		{
			System.out.println(num+":is a perfect number");	
		}
		else
		{
			System.out.println(num+":is not a perfect number");	
		}

}}
