package com.collections;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<String>();
		
		treeset.add("B");
		treeset.add("C");
		boolean r1=treeset.add("A");
		System.out.println(r1);
		boolean r2 =treeset.add("A");
		System.out.println(r2);
		
		System.out.println(treeset);
		
	}

}




//It maintains the uniqueness and natural ordering of elements automatically.
//It uses its own sorting algorithm to sort based on their natural order of their sequence.
//Incase if we are using the custom class such as student class,customer class ,that time it needs to tell java how to sort elements
//     by using comparable and comparator implementation.