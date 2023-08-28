package com.gqt.basicprograms.pkg1;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n,sum=0,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(temp>0){
			int dig=temp%10;
			sum=sum+(dig*dig*dig);
			temp=temp/10;
		}
		if(sum==n) 
			System.out.println("Number is armstrong");
			else 
				System.out.println("Number is  not armstrong");
				
			}
			
		}
		



