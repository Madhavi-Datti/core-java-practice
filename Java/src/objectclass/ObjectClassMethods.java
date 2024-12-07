package objectclass;

public class ObjectClassMethods {
	private int number;
	private String name;
	public static void main(String[] args) {
		ObjectClassMethods obj = new ObjectClassMethods(39, "madhu");
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		//System.out.println(super.)

	}

	public ObjectClassMethods(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return number+" " +name;
		
	}
	@Override
	public int hashCode() {
		return 1234;
		}
}
