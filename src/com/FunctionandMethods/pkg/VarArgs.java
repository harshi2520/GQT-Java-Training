package com.FunctionandMethods.pkg;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		fun(2,3,4,5,6,7,8); //Any number of Arguments we can take
		multiple(76,89,"harshitha" ,"Bhumika" ,"Ksheeraja");
	} 
	
	static void multiple(int a ,int b, String ...v) {
		System.out.println(a,b,Arrays.toString(v));
		
	}
	
	static void fun(int ...v) {  // Variablelength Arguments
		System.out.println(Arrays.toString(v));
	}

}
