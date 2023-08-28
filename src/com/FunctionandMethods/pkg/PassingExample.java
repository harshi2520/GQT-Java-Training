package com.FunctionandMethods.pkg;

public class PassingExample {

	public static void main(String[] args) {
		String name = "Bhumika Bharadwaj";
		greet(name);
		}
	
	static void greet(String naam) {
		
		System.out.println(naam);
		
	}

}

//here name is pointing to the bhumika bharadwaj,wn name is passed in the greet method the copy of the value of the reference variable is passed
//so naam ref variable holds a copy of the value therefore it is pointing towards the same object.
//Any changes made to the via naam variable will also be reflected in the main object.
