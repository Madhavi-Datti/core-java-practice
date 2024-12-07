package InnerClasses;

public class OuterClass {
	private int a = 10;
	public class MemberInnerClass
	{
		void display()
		{
			System.out.println(a);
		}	
	}
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		OuterClass.MemberInnerClass obj1 = obj.new MemberInnerClass();
		obj1.display();
	}
}
