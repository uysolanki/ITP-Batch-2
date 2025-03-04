package javaday17.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int arr[]= {10,20,30,10,50,20,70};					//output 10 20 30 50 70
		
		Set<Integer> numbers=IntStream.of(arr)              // Create an IntStream from the int array
                			.boxed()           				// Box each int to Integer
                			.collect(Collectors.toSet());
		
		Set<Integer> numbers1=new HashSet(Arrays.asList(10,20,30,10,50,20,70));
		
		System.out.println(numbers);
		System.out.println(numbers1);
	}
}
