package Generics;

import java.util.*;

class GenericsClass2<T,K>
{
	private T num;
	private K name;
	

public GenericsClass2(T num, K name) {
		this.num = num;
		this.name = name;
	}

public T getNum() {
	return num;
}
public K getName() {
	return name;
}

@Override
public String toString() {
return "GenericsClass2 [num=" + num + ", name=" + name + "]";
}
}
public class Generics2 {

	public static void main(String[] args) {
	List<GenericsClass2<Integer, String>> g = new LinkedList();
	g.add(new GenericsClass2<Integer, String>(1, "madhu"));
	g.add(new GenericsClass2<Integer, String>(2, "madhu"));
	g.add(new GenericsClass2<Integer, String>(3, "madhu"));
	
	for(GenericsClass2<Integer, String> b:g)
	{
		System.out.println(b);
	}
	}

}
