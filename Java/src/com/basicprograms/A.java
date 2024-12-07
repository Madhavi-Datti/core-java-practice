package com.basicprograms;

class T{ 
T getT(){  
return this;  
}

@Override
public String toString() {
	return "obj";
} 

}  
class A{  
public static void main(String[] a){  
System.out.println(new T().getT());
}  
} 