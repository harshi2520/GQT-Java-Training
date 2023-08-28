package com.collections;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
	
		for(int i=1;i<=5;i++) {  //Adding elements to the arraylist
			arrayList.add(i);
		}
		
		//printing elements
		System.out.println(arrayList);
		
		//remove element at index 3
		arrayList.remove(3);
		
		//Displaying the Arraylist after deletion
		System.out.println(arrayList);
		
		//printing elements one by one
//      for(int i=0; i<arrayList.size();i++) {
//	    	System.out.print(arrayList.get(i)+ " ");//get method to fetch the elements
//	    }
		
		for(int i : arrayList) {           //Enhanced for loop
			System.out.print(i + " ");
		}
	}
}

