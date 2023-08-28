 package com.gqt.arraysproj.pkg1;

import java.util.Scanner;

public class ArrayCode3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of Universities:");
		int uni=sc.nextInt();
		int arr[][][][]=new int[uni][][][];

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of colleges inside the RV University:");
			arr[i]=new int[sc.nextInt()][][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside RV university:");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of classes inside the college"+(j+1));
				for(int k=0;k<arr[i][j].length;j++) {
					System.out.println("Enter the count of students inside the class"+(k+1));
					arr[i][j][k]=new int[sc.nextInt()];
				}
		
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside RV university:");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of classes inside the college"+(j+1));
				for(int k=0;k<arr[i][j].length;j++) {
					System.out.println("Enter the count of students inside the class"+(k+1));
				arr[i][j][k]=new int[sc.nextInt()];
			}
		}
	}
			for(int i=0;i<arr.length;i++) {
			System.out.println("Inside RV University:");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside college:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Inside class:"+(k+1));
				for(int l=0;l<arr[i][j][k].length;l++) {
					System.out.println("The marks of Student no:"+(l+1));
					arr[i][j][k][l]=sc.nextInt();
				}
		   }

        }
	}

			for(int i=0;i<arr.length;i++) {
			System.out.println("Inside VR University:");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside college:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Inside class:"+(k+1));
				for(int l=0;l<arr[i][j][k].length;l++) {
					System.out.println("The marks of Student no:"+(l+1)+" is "+arr[i][j][k][l]);
				}
				}
			}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the count of colleges inside the VR University:");
				arr[i]=new int[sc.nextInt()][][];
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside VR university:"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the count of classes inside the college"+(j+1));
					for(int k=0;k<arr[i][j].length;j++) {
						System.out.println("Enter the count of students inside the class"+(k+1));
						arr[i][j][k]=new int[sc.nextInt()];
					}
			
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside VR university:");
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the count of classes inside the college"+(j+1));
					for(int k=0;k<arr[i][j].length;j++) {
						System.out.println("Enter the count of students inside the class"+(k+1));
					arr[i][j][k]=new int[sc.nextInt()];
				}
			}
		}
				for(int i=0;i<arr.length;i++) {
				System.out.println("Inside VR University:");
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Inside college:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Inside class:"+(k+1));
					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("The marks of Student no:"+(l+1));
						arr[i][j][k][l]=sc.nextInt();
					}
			   }

	        }
		}

				for(int i=0;i<arr.length;i++) {
				System.out.println("Inside VR University:");
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Inside college:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("Inside class:"+(k+1));
					for(int l=0;l<arr[i][j][k].length;l++) {
						System.out.println("The marks of Student no:"+(l+1)+" is "+arr[i][j][k][l]);
					}
					}
				}
				}
	}
}
			
		
		