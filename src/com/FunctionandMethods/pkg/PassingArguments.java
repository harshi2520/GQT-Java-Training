package com.FunctionandMethods.pkg;
import java.util.Scanner;
public class PassingArguments {

	public static void main(String[] args) {
//    System.out.println("Enter the numbers :");
	Scanner in = new Scanner(System.in);
//	int x = in.nextInt();
//	int y = in.nextInt();
//	int ans = sum(x,y);
//	System.out.println(ans);
//	}
//	
//	static int sum(int a,int b) {
//		int sum = a + b;
//		return sum;
		
		
		System.out.print("Enter the name:");
		String name = in.next();
		String wish = greeting(name);
		System.out.println(wish);
	}
    static String greeting(String name) {
    	String wishes = "Happy birthday " + name;
    	return wishes;
    }
}



//In java there is no paas by reference its only pass by value