package com.gqt.basicprograms.pkg1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n,r=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		while(n!=0) {
			int rem=n%10;
			r=(r*10)+rem;
			n=n/10;
		
		}
		
			System.out.println("The reverse of the number is:"+r);

	}

}
