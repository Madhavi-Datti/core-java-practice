package InnerClasses;

abstract class Eat
{
	abstract void eat();
}
 class OuterClass2 {
	public static void main(String[] args) {
		Eat obj = new Eat()
			{
	 public void eat()
	{
		System.out.println("mango");
	}
	 
	 };
	 obj.eat();
	}

}
