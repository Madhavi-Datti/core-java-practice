package com.datatypes;

public class AllDataTypes {
	//default values
	boolean bl;
	byte  b; 
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	String name;
	//intialization of values
	boolean person = true; //1 bit
	byte  by = 127;   //1 byte
	short sh = 32767;   //2 bytes
	int in = 2^31-1; //4 bytes
	long ln = 2^63-1; //8 bytes
	float fl = 4678.450f; //4 bytes
	double db = 878908.0d; //8 bytes
	char ch1 = 'M'; //2 bytes
	String name1 = "Madhavi";

	public static void main(String[] args) {
		AllDataTypes obj = new AllDataTypes();
		
		System.out.println(obj.bl);
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.ch);
		System.out.println(obj.name);
		
		System.out.println(obj.person);
		System.out.println(obj.by);
		System.out.println(obj.sh);
		System.out.println(obj.in);
		System.out.println(obj.ln);
		System.out.println(obj.fl);
		System.out.println(obj.db);
		System.out.println(obj.ch1);
		System.out.println(obj.name1);
		
	}

}
