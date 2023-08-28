package com.FunctionandMethods.pkg;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
	//sum1();	
	int res = sum2(10, 20);
	System.out.println(res);

	} 
	static int sum2(int a, int b) { // Returning
		int res = a + b;
        return res;
        
        //System.out.println("This statement will never reachable after returning anything");
		
		}
	
//	static void sum1() {  //void does not return instead it just displays the value
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the first number: ");
//		int num1 = in.nextInt();
//		System.out.println("Enter the Second number: ");
//		int num2 = in.nextInt();
//		int res = num1 + num2;
//		System.out.println("The sum is: "+ res); //just displaying
//		}

}
