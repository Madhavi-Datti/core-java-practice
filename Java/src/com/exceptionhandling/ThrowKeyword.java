package com.exceptionhandling;
import java.io.*;  
	  public class ThrowKeyword {   
		  public static void method() throws FileNotFoundException {  
	        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file); 
	    } 
	    public static void main(String args[]){  
	        try  
	        {  
	            method();
	        }   
	        catch (FileNotFoundException e)   
	        {  
	            e.printStackTrace();  
	        }  
	        System.out.println("rest of the code..."); 
	        
	  }    
	}  
