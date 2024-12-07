package InnerClasses;

public class OuterClass3 {
	static int a= 10;
	static class InnerClass
	{
		void msg()
		{
			System.out.println("This is static inner class");
			System.out.println(a);
		}
		
	}

	public static void main(String[] args) {
		
		OuterClass3.InnerClass obj = new OuterClass3.InnerClass();
		obj.msg();
		

	}

}
