package com.gqt.arraysproj.pkg1;

import java.util.Scanner;

public class ArrayCode4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Schools:");
		int scl=sc.nextInt();
		System.out.println("Enter the count of classes:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students:");
		int stu=sc.nextInt();
		int arr[][][]=new int[scl][cls][stu];
		
		for(int i=0;i<scl;i++) {
			System.out.println("Inside school:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside class:"+(j+1));
			for(int k=0;k<stu;k++) {
				System.out.println("Enter the marks of studnet no:"+(k+1));
				arr[i][j][k]=sc.nextInt();			
			}
		}
   }
		for(int i=0;i<scl;i++) {
			System.out.println("Inside school:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside class:"+(j+1));
			for(int k=0;k<stu;k++) {
				System.out.println("The marks of studnet no:"+(k+1)+" is "+arr[i][j][k]);
			}
       }
  }
						
		

}
}