package com.collections.linkedhashmap;
import java.util.*;

	public class LinkedHashMapExample {

		public static void main(String[] args) {
			//creation
			Map<Integer,String> lhm = new LinkedHashMap<>();
			//addition of elements
			lhm.put(39,"Madhu");
			lhm.put(8,"Radhik");
			lhm.put(20,"Raji");
			lhm.put(null,"Rani");
			lhm.put(151,"Muttu");
			lhm.put(17,"Radhik");
			lhm.put(22,"VaraPrasad");
			lhm.put(7,"Vardhan");
			System.out.println(lhm);
			//retrival of all keys
			
			Set<Integer> keys = lhm.keySet();
			for(Integer key:keys)
			{
				System.out.println(key);
			}
			
			//retrival of all values
			Collection<String> values = lhm.values();
			for(String value:values)
			{
				System.out.println(value);
			}
			
			//retrival based on key
			System.out.println(lhm.get(39));
			
			//retrival of all keys and values
			
//			for(Integer key:keys)
//			{
//				System.out.println(key + "-" +lhm.get(key));
//			}
			
			//    Or
				
			Set<Map.Entry<Integer, String>> e = lhm.entrySet();
			for (Map.Entry<Integer, String> entry : e) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    System.out.println(key + " -> " + value); 
			}
			//deletion of keys
			lhm.remove(151);
			lhm.remove(17);
			lhm.remove(null);
			System.out.println(lhm);
			
			//verification of keys and values
			System.out.println(lhm.containsKey(6));
			System.out.println(lhm.containsValue("Radhik"));
			
			//updation of elements
			lhm.put(14,"Avinash");
			lhm.putIfAbsent(191, "Muttu");
			lhm.putIfAbsent(21, "Praveen");
			lhm.replace(22, "Vara");
			System.out.println(lhm);
			System.out.println(lhm.size());
			lhm.clear();
			System.out.println(lhm);		
			}
			
		}