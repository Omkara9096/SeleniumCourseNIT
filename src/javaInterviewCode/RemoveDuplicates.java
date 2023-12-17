package javaInterviewCode;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] a) {
		
		//Create Hashset (Its contains unique value only)
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		// adding elements to LinkedHashSet
		for (int i=0; i<a.length; i++) {
			
			set.add(a[i]);
		
		}
		
		//Print the elements of LinkedHashSet
		System.out.println(set);
		
	}

	public static void main(String[] args) {
		
		int a[] = {5,6,7,2,3,5,8,4,3,5,8,9};
		
		removeDuplicates(a);
	}
}
