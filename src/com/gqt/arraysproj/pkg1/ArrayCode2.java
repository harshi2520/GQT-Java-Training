package com.gqt.arraysproj.pkg1;

import java.util.Scanner;

public class ArrayCode2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of classes:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students:");
		int stu=sc.nextInt();
		int arr[][]=new int[cls][stu];
		
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter name of Student no:"+(j+1));
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<cls;i++) {
			System.out.println("Inside class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The name of Student no:"+(j+1)+" is:"+arr[i][j]);
		
			}
	}

}
}
