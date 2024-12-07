package com.multithreading;

public class MultiThreading2 {

	public static void main(String[] args) {
//		Runnable r = new Runnable()
//		{
//			@Override
//			public void run() {
//				
//				System.out.println("Hi thread"+ " "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
//				System.out.println(Thread.activeCount());
//			}
//			
//				};
//		Thread t1 = new Thread(r, "T1");
//		t1.start();
		
		Runnable r =()-> System.out.println("Hi thread"); 
		Thread t1 = new Thread(r, "T1");
		t1.start();
	}
	}

