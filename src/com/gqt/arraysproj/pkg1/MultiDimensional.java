package com.gqt.arraysproj.pkg1;
import java.util.Scanner;
public class MultiDimensional {
	public static void main(String[] args) {
		/*
		    1 2 3
		    4 5 6 
		    7 8 9
		 */
		
//		int[][] arr = new int[3][];
//		
//		int[][] arr1 = {
//				{1,2,3},
//				{4,5},
//				{6,7,8}
//			
//		};
		
		int[][] arr = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println(arr.length); // no of rows
		
		//input
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();		
			}
		}
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col] + " ");		
//			}
//			
//			System.out.println();
//		}
		
//		for(int row = 0; row < arr.length; row++) {
//			System.out.println(java.util.Arrays.toString(arr[row]));
//		}
		
		for(int[] a : arr) {
			System.out.println(java.util.Arrays.toString(a));
		
		}
		
		
	}
}
		
		