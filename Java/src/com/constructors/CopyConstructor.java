package com.constructors;

public class CopyConstructor {
	int x, y;
	CopyConstructor(int a, int b){
		x = a;
		y = b;
		System.out.println(a+b);
	}
	CopyConstructor(CopyConstructor cc){
		x = cc.x;
		y = cc.y;
		System.out.println("copy constructor");
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		CopyConstructor obj = new CopyConstructor(10,20);
		
		CopyConstructor obj1 = new CopyConstructor(obj);
	}

}
