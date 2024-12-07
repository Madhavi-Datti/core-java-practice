package com.collections.treemap;
import java.util.*;
public class TreeMapExample {
	public static void main(String[] args) {
			//creation
			Map<Integer,String> tm = new TreeMap<>();
			//addition of elements
			tm.put(39,"Madhu");
			tm.put(8,"Radhik");
			tm.put(20,"Raji");
			tm.put(151,"Muttu");
			tm.put(17,"Radhik");
			tm.put(22,"VaraPrasad");
			tm.put(7,"Vardhan");
			System.out.println(tm);
			//retrival of all keys
			
			Set<Integer> keys = tm.keySet();
			for(Integer key:keys)
			{
				System.out.println(key);
			}
			
			//retrival of all values
			Collection<String> values = tm.values();
			for(String value:values)
			{
				System.out.println(value);
			}
			
			//retrival based on key
			System.out.println(tm.get(39));
			
			//retrival of all keys and values
			
//			for(Integer key:keys)
//			{
//				System.out.println(key + "-" +tm.get(key));
//			}
			
			//    Or
				
			Set<Map.Entry<Integer, String>> e = tm.entrySet();
			for (Map.Entry<Integer, String> entry : e) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    System.out.println(key + " -> " + value); 
			}
			//deletion of keys
			tm.remove(151);
			tm.remove(17);
			System.out.println(tm);
			
			//verification of keys and values
			System.out.println(tm.containsKey(6));
			System.out.println(tm.containsValue("Radhik"));
			
			//updation of elements
			tm.put(14,"Avinash");
			tm.putIfAbsent(191, "Muttu");
			tm.putIfAbsent(21, "Praveen");
			tm.replace(22, "Vara");
			System.out.println(tm);
			System.out.println(tm.size());
			tm.clear();
			System.out.println(tm);		
			}
			
		}