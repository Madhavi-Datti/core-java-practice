package com.collections.hashtable;
import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		//creation
		Map<Integer,String> ht = new Hashtable<>();
		//addition of elements
		ht.put(39,"Madhu");
		ht.put(8,"Radhik");
		ht.put(20,"Raji");
		ht.put(151,"Muttu");
		ht.put(17,"Radhik");
		ht.put(22,"VaraPrasad");
		ht.put(7,"Vardhan");
		System.out.println(ht);
		//retrival of all keys
		
		Set<Integer> keys = ht.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		//retrival of all values
		Collection<String> values = ht.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		
		//retrival based on key
		System.out.println(ht.get(39));
		
		//retrival of all keys and values
		
//		for(Integer key:keys)
//		{
//			System.out.println(key + "-" +ht.get(key));
//		}
		
		//    Or
			
		Set<Map.Entry<Integer, String>> e = ht.entrySet();
		for (Map.Entry<Integer, String> entry : e) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key + " -> " + value); 
		}
		//deletion of keys
		ht.remove(151);
		ht.remove(17);
		System.out.println(ht);
		
		//verification of keys and values
		System.out.println(ht.containsKey(6));
		System.out.println(ht.containsValue("Radhik"));
		
		//updation of elements
		ht.put(14,"Avinash");
		ht.putIfAbsent(191, "Muttu");
		ht.putIfAbsent(21, "Praveen");
		ht.replace(22, "Vara");
		System.out.println(ht);
		System.out.println(ht.size());
		ht.clear();
		System.out.println(ht);		
		}
		
	}