package Generics;
class Generics1<T extends Integer, K extends String>
{
	private T typeData;
	private K keyData;
	
	public Generics1(T typeData, K keyData) {
		this.typeData = typeData;
		this.keyData = keyData;
	}

	public T getTypeData() {
		return typeData;
	}

	public K getKeyData() {
		return keyData;
	}
	
}
public class GenericsClass {

	public static void main(String[] args) {
		
	Generics1<Integer, String> obj = new Generics1<Integer, String>(1, "madhavi");
	//Generics1<Integer, String> obj = new Generics1<Integer, String>("madhavi", 1);
	System.out.println(obj.getTypeData());
	System.out.println(obj.getKeyData());

	}

}
