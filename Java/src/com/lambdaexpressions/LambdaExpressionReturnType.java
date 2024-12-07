package com.lambdaexpressions;

public class LambdaExpressionReturnType {

	public static void main(String[] args) {
		Car c = ()-> 100;
	System.out.println(c.getSpeed());
}
}
@FunctionalInterface
interface Car
{
	public int getSpeed();
}
