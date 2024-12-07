package com.collections.hashmap;
	import java.util.*;

	public class HashMapExample {

		public static void main(String[] args) {
			//creation
			Map<Integer,String> hm = new HashMap<>();
			//addition of elements
			hm.put(39,"Madhu");
			hm.put(8,"Radhik");
			hm.put(20,"Raji");
			hm.put(null,"Rani");
			hm.put(151,"Muttu");
			hm.put(17,"Radhik");
			hm.put(22,"VaraPrasad");
			hm.put(7,"Vardhan");
			System.out.println(hm);
			//retrival of all keys
			
			Set<Integer> keys = hm.keySet();
			for(Integer key:keys)
			{
				System.out.println(key);
			}
			
			//retrival of all values
			Collection<String> values = hm.values();
			for(String value:values)
			{
				System.out.println(value);
			}
			
			//retrival based on key
			System.out.println(hm.get(39));
			
			//retrival of all keys and values
			
			for(Integer key:keys)
			{
				System.out.println(key + "-" +hm.get(key));
			}
			
			//    Or
				
			Set<Map.Entry<Integer, String>> e = hm.entrySet();
			for (Map.Entry<Integer, String> entry : e) {
			    Integer key = entry.getKey();
			    String value = entry.getValue();
			    System.out.println(key + " -> " + value); 
			}
			//deletion of keys
			hm.remove(151);
			System.out.println(hm);
			
			//verification of keys and values
			System.out.println(hm.containsKey(6));
			System.out.println(hm.containsValue("Radhik"));
			
			//updation of elements
			hm.put(14,"Avinash");
			hm.putIfAbsent(191, "Muttu");
			hm.putIfAbsent(21, "Praveen");
			hm.replace(22, "Vara");
			System.out.println(hm);
			System.out.println(hm.size());
			hm.clear();
			System.out.println(hm);		
			}
			
		}

