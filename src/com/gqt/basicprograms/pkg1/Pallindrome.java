package com.gqt.basicprograms.pkg1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int n,r,sum=0,temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Pallindrome number");
		else
			System.out.println("Not a Pallindrome number");
			

	}

}
