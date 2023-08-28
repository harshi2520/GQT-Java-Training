package com.FunctionandMethods.pkg;

public class Scope {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		String name = "Harshitha";
		System.out.println(a);
		random();
//		System.out.println(var);  Cannot  access var here
		
		
		{
			a = 30;  //u can use it or update var a but cannot re-initialize it.
			int c = 40;
			System.out.println(c);
			name = "Bhumika R Bharadwaj";
			System.out.println(name);
			
		}
//		System.out.println(c);  u can re-initialize c but cannot use it or update it
		int c = 50;
		System.out.println(c);
		System.out.println(a);
		name = "Ksheeraja";
		
		
		//scope for for loop
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
			int num = 1000;
			System.out.println(num);
		}
		
//		System.out.println(num); //cannot access num variable
   }
	static void random() {
		int var = 100;
		System.out.println("var = " + var);
	}
	
}
