package com.FunctionandMethods.pkg;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
        int b = 20;
        System.out.print(a + " " + b + " Before Swapping\n");
        int temp = a;
    	a = b;
    	b = temp;
    	System.out.print(a + " " + b + " After Swapping");
//        swap(a,b);
	}
		
/*		String name = "Harshitha";
        changeName(name);
        System.out.println(name);
        }

	 static void changeName(String naam) {
		 naam = "Harshitha Mohan"; //creating a new object also WE cannot modify Strings
		 } 
		                             /* name does not change here bcoz here only
		                              the value is getting copied into another ref 
		                              variable so it points to the same object ..... 
		                              to understand go to the passing example 
		                              here we are not changing the object,instaed v r 
		                              creating a new object */
		                                

  
        static void swap(int a,int b) {
//        	int temp = a;
//        	a = b;
//        	b = temp;
        }

}
