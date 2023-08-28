package com.collections;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		stack.push("America");
		stack.push("Australia");
		stack.push("India");
		
		System.out.println("Stack:"+ stack);
		
		String poppedElement=stack.pop();
		System.out.println("Popped element:" + poppedElement);
		
		System.out.println("Modified Stack is:"+ stack);
		
		String poppedElement1=stack.peek();         //This method is just to view which is the top element
		System.out.println("Top element:" + poppedElement1);
		
		System.out.println("Modified Stack is:"+ stack);
		
	}

}
