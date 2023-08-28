package com.collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("a",10);
		map.put("b",20);
		map.put("c",30);
		
		System.out.println("Size of map is:" +map.size());
		System.out.println(map);
		
		if(map.containsKey("a")) {
			Integer a=map.get("a");
			System.out.println("value for key" + " \"a\" is: "+ a);
		}
		
		for(String Key:map.keySet()) {             // fetch all the keys in set representation when we have access to the keyset
			System.out.println("Key: "+ Key+", value: "+map.get(Key));
			
		}
		
		for(Entry<String,Integer> entry :map.entrySet()) {        ///when we have access to both keyset and values
			System.out.println("key " + entry.getKey() + ", value: "+entry.getValue());
		}
		

	}

}
