package com.patterns;
import java.util.Scanner;
public class P1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = s.nextInt();
		s.close();
		for(int i =1;i<=n/2;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
		    }
			System.out.println();
		}
		for(int i=1;i<=n/2;i++)
		{
			for(int j=(n/2-1);j>=i;j--)
			{
			System.out.print("*");
		    }
			System.out.println();
		}
	        
	}

}