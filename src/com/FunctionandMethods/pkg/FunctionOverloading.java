package com.FunctionandMethods.pkg;

public class FunctionOverloading {

	public static void main(String[] args) {
		fun(10);
		int ans = fun(20,30);
		System.out.println(ans);
		fun("harshi");
		

	}
	
	static void fun(int a) {
		System.out.println(a);
		
	}

	static int fun(int b,int c) {
		return b + c;
	}
	
	static void fun(String name) {
		System.out.println(name);
	}
}
 //for method overloading either number of arguments shud be different or type of arguments shud be differnt.