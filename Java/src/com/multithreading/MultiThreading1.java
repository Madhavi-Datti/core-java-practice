package com.multithreading;

public class MultiThreading1 {

	public static void main(String[] args) {
		Employee e = new Employee();
		Thread t = new Thread(e,"T1");
		t.start();
		System.out.println(Thread.activeCount());

	}

}
 class Employee implements Runnable
{

	@Override
	public void run() {
System.out.println("This is a thread"+"-"+Thread.currentThread().getName()+"-"+Thread.currentThread().getId());
		
	}
	
}

