package com.collections;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<>();
		
		queue.add("India");
		queue.add("America");
		queue.add("Germany");
		System.out.println("Original Queue: " +queue);   //(Random order)When we use the priorityQueue and try to print the queue inside sos we will not get the natural sorting order. 
		
		queue.remove();   //when we try to add,remove,and peek the elements we will get the natural Sequence.
		System.out.println("Queue afyer removing the head element:" + queue);
		
		String head=queue.peek();  // These will respect natural sorting order.
		System.out.println("Head of the queue: " +head);
		
		head=queue.poll();   //This method is used to view the head and also remove the head at the same time.
		System.out.println("Removed head: " +head);
		
		System.out.println("The modified Queue is:"+ queue);
		}


}
