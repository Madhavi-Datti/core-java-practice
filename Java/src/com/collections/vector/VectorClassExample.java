package com.collections.vector;
import java.util.*;
class VectorClass
{
	public int a = 10;
	public String b = "madhu";
	public VectorClass(int a, String b) {
		this.a = a;
		this.b = b;
	}
	@Override 
	public String toString() {
		return a+" "+b;
	}	
}

public class VectorClassExample {

	public static void main(String[] args) {
		List<VectorClass> l = new Vector<>();
		l.add(new VectorClass(1,"madhu"));
		l.add(new VectorClass(1,"madhavi"));
		
//		Iterator i = l.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
	for(VectorClass v:l)	
	{
		System.out.println(v);
	}

}}
