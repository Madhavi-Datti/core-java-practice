package com.exceptionhandling;
	import java.io.*;
public class ThrowAndThrowsExample {
		public static void main(String[] args) {
			System.out.println("started");
		try  
		       {  
		            method1();  
		        }   
		catch (FileNotFoundException e)   
		      {  
		            e.printStackTrace();  
		        }  
		finally
			{
			System.out.println("ended");
			}
		   
		    method2();
		
		}
		public static void method1() throws FileNotFoundException
		{
		   	File file = new File("D:resume.doc");
			FileInputStream fis = new FileInputStream(file);
		   
		}
			
		public static void method2()
		{
	        int a = 10;
	        int b = 0;
	        if(a/b ==10)
	        {
	            System.out.println("yes");
	        }
	        else{
	            throw new ArithmeticException("no");
	        }
	        
		}
		}

