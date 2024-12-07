package com.multithreading;
public class MultiThreading {
	public static void main(String[] args) {
		A t1 = new A("T1");
		t1.start();
		System.out.println(Thread.activeCount());
	}
}
class A extends Thread
{
	A(String name)
	{
		super(name);
	}
	@Override
	public void run() 
	{
		System.out.println("First Thread"+"-"+Thread.currentThread().getName()+"-"+ Thread.currentThread().getId());
	}
	
}
