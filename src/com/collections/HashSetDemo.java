package com.collections;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet<String>();
		
		hashset.add("A");
		System.out.println(hashset);
		hashset.add("B");
	    System.out.println(hashset);
		hashset.add("C");
	    System.out.println(hashset);
		hashset.add("C");
		System.out.println(hashset);   //not displayed bcoz duplicates are not allowed in set.
		
		
		System.out.println("Set contains C or not? " + hashset.contains("C"));
		
		hashset.remove("A");
	    System.out.println("set after removing A: " + hashset);
		 
		 for(String item:hashset) {
			 System.out.print(item + " ");
		 }

	}

}
