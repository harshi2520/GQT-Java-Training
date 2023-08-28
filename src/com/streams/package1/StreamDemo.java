package com.streams.package1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbersList=new ArrayList<Integer>();
		numbersList.add(100);
		numbersList.add(200);
		numbersList.add(300);
		numbersList.add(400);
		
//		ArrayList<Integer> squareList=new ArrayList<Integer>();   Normal Object oriented program without streams
//		for(Integer i:numbersList) {
//			squareList.add(i*i);
//		}
		
		
		//Stream representation in one line using map method
//		List<Integer> squaresList=numbersList.stream().map(x->x*x).collect(Collectors.toList())	; //map method can be used to change the representation of the above elements to the square of these elements
//		System.out.println("List of Squared numbers:" + squaresList);
		
//		Set<Integer> squareSet=new HashSet<Integer>();	
//		for(Integer i:numbersList) {
//			squareSet.add(i*i);
//			}
		
//	    Set<Integer> squareSet=numbersList.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println("Set of Squared numbers:"+ squareSet);
		
//       filter method using classical method
		
		
//		List<String> languages=new ArrayList<String>();
//		languages.add("Scala");
//		languages.add("Java");
//		languages.add("Python");
//		languages.add("Basics c");
//		
//		List<String> filterResult=new ArrayList<String>();
//		for(String s:languages) {
//			if(s.startsWith("P")){
//				filterResult.add(s);
//				}
//			}
//      filter method using streams method
		
//		List<String> filterResult=languages.stream().filter(s->s.startsWith("J")).collect(Collectors.toList());
//		System.out.println("Languages starting with 'P':" + filterResult);
		
//		Streams to sort and iterate over collections
		
//		List<String> sortedList=languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("Languages after sorting:" + sortedList);
//
//     Iterating using forEach
//		System.out.println("Printng elements one by one");
//		languages.stream().forEach(y -> System.out.println("Element is:" +y));
		
//		Reduce method in streams 	
		
		int sum=numbersList.stream().reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of all the elements in the numberList:" +sum);
		

	}

}
