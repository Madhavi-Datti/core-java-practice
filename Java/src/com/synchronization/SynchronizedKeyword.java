package com.synchronization;
public class SynchronizedKeyword 
{
	public static void main(String[] args) throws InterruptedException {
		
		Table obj = new Table();//only one object  
		Thread t1=new Thread(){  
		public void run(){  
		obj.printTable(5);  
		}  
		};  
		
		Thread t2=new Thread(){  
		public void run(){  
		obj.printTable(10);  
		}  
		};  
		  
		t1.start(); 
		//t1.join();
		t2.start();  
		}  
		}  
		class Table{
			synchronized static void  printTable(int n){//synchronized method  
			   for(int i=1;i<=5;i++){  
			     System.out.println(n*i); 
			    
			   }  
			  
			 }  
			}  
 