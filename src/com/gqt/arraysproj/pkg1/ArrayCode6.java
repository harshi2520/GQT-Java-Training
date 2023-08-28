package com.gqt.arraysproj.pkg1;

import java.util.Scanner;

public class ArrayCode6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Schools:");
		int scl=sc.nextInt();
		int arr[][][]=new int[scl][][];
		

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside the School:"+(i+1));
			arr[i]=new int[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students inside the class"+(j+1));
				arr[i][j]=new int[sc.nextInt()];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the marks of students:"+(k+1));
				arr[i][j][k]=sc.nextInt();
			}
		}
				
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class"+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("The marks of students:"+(k+1)+" is "+arr[i][j][k]);
			}
		}
		
		
		
	}

}
}
