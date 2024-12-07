package InnerClasses;

public class OuterClass1 {
	int a = 10;
	void display()
	{
		class LocalInnerClass{
			 void msg()
			{
				System.out.println("this is local inner class method");
				 System.out.println(a);
			}
		}
			 LocalInnerClass obj = new LocalInnerClass();
			 obj.msg();
		}

	public static void main(String[] args) {
		
		OuterClass1 obj1 = new OuterClass1();
		obj1.display();
	}

}
