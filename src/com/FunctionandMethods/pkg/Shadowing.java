package com.FunctionandMethods.pkg;

public class Shadowing {
     static int x = 90;  //this will be shadowed at line 8
	public static void main(String[] args) {
		System.out.println(x); //90
		int x;    //declaration
//		System.out.println(x);  // scope will begin when value is initialized
		x = 50;   //Initialization
		System.out.println(x); //40
		fun();

	}
	
	static void fun() {
		System.out.println(x);
	}

}
// shadowing does not takes place in methods