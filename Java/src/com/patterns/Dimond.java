package com.patterns;

import java.util.Scanner;

public class Dimond {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = s.nextInt();
		s.close();
		for(int i=1;i<=n/2;i++)
    	{
    		for(int k=(n/2-1);k>=i;k--)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	
    	for(int i=1;i<=n/2;i++)
    	{
    		for(int k=1;k<=i;k++)
    		{
    			System.out.print(" ");
    		}
    		for(int j=(n/2-1);j>=i;j--)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	

	}

}
