package com.gqt.arraysproj.pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[] arr = new int[5];
//		
//		// array of primitives
//		for(int i=0; i < arr.length; i++) {
//			arr[i] = in.nextInt();		
//		}
//		
//		// 3 ways to print elements of the array
//		for(int i=0; i < arr.length; i++) {               //for loop
//			System.out.println(arr[i] + " ");
//		}
//		
//		for(int num : arr) {           //for every element in the array, print the element
//		System.out.println(num + " ");  //here num represents element of the array
//	}
//		
//		System.out.println(Arrays.toString(arr));
//		
		// array of objects
		String[] str = new String[4];
		for(int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}
		
		System.out.println(Arrays.toString(str));
		
		//modify
		str[1] = "Himmath";
		System.out.println(Arrays.toString(str));
		

	}

}
