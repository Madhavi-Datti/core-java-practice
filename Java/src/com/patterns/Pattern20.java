package com.patterns;

public class Pattern20 {
	public static void main(String[] a)
	{
		for(int i=0;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(n+" ");
                n = n * (i - j) / (j+1);
			}
			System.out.println();
		}
	}

}
