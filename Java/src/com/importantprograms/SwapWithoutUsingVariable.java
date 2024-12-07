package com.importantprograms;
//Using Arithmetic Operator
public class SwapWithoutUsingVariable {

	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	a = a+b; //30
	b = a-b; //30-20 = 10
	a = a-b; //30-10 = 20
System.out.println(a);
System.out.println(b);
	}
}
/*Uinsg BitWise Operator
public class SwapWithoutThirdVariable {
public static void main(String[] args) {
    int a = 5;
    int b = 10;

    System.out.println("Before swapping: a = " + a + ", b = " + b);

    // Swapping using bitwise XOR
    a = a ^ b; // a now becomes 15 (binary: 1010 ^ 0101 = 1111)
    b = a ^ b; // b now becomes 5 (binary: 1111 ^ 0101 = 1010)
    a = a ^ b; // a now becomes 10 (binary: 1111 ^ 1010 = 0101)

    System.out.println("After swapping: a = " + a + ", b = " + b);
}
}
*/