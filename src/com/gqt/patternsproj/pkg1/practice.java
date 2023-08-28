package com.gqt.patternsproj.pkg1;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=25;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(i==1||i==n||j==1||j==n) {
    			if(count<10) {
    				System.out.print("0"+count+" " );
    			    count--;
    			    }
    			else {
    				System.out.print(count+" ");
    				count--;
    				}
    			}
    		    System.out.println();
    		    }
    		}
    	}
}

