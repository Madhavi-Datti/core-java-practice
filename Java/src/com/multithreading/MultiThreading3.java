package com.multithreading;

public class MultiThreading3 {

	public static void main(String[] args) throws  Exception {
		Runnable r1 = ()-> {
			for(int i = 0; i<5;i++)
			System.out.println("Thread 1");
			};
		Runnable r2 = ()-> {
			for(int i = 0; i<7;i++)
			System.out.println("Thread 2");		
		};
				
		Thread t1 = new Thread(r1);         //new
		t1.start();	                        //runnable  
		t1.join();                          //waiting
		t1.sleep(10000);                    //Timed-waiting
											//terminated
		Thread t2  = new Thread(r2);
		t2.start();

}}