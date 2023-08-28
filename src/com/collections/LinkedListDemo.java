package com.collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		
		list.add("A");
		System.out.println(list);
		list.add("B");
		System.out.println(list);
     	list.add("C");
     	System.out.println(list);
		list.addFirst("D");
		System.out.println(list);
		list.add(2,"E");
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
	}

}




//  LinkedList are used where order of elements is strictly maintained in which one element refers to the other element.
//  we cannot access the elements randomly as in arraylist,in this case if we want to access the elements we have to traverse from the beginning to the element we required.
//implementation is not synchronised.(Not thread safe)