package com.lambdaexpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		Bike b = (speed, name) ->{
			System.out.println("Bike speed is " +speed);
			System.out.println("Bike name is "+name);
			if(speed<120)
				System.out.println("slow driving slow");
					else
						System.out.println("speed driving");
		};
		b.drive(40,"Honda");
		

	}

}
@FunctionalInterface
interface Bike
{
	public void drive(int speed, String name);
}
