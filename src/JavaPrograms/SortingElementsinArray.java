package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsinArray {

	public static void main(String[] args) {
		
		//Approach 1
//		int a[]= {10,30,20,50,5};
//		System.out.println("Array of elements before sorting" +Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array of elements after sorting" +Arrays.toString(a));
		
		
		//Approach 2
		
//		int a[]= {10,30,20,50,5};
//		System.out.println("Array of elements before sorting" +Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array of elements after sorting" +Arrays.toString(a));
		
		//Approach Decending order sorting-we have use derviced Datatype Integer as Collection will not support primitive data type
		Integer a[]= {10,30,20,50,5};
		System.out.println("Array of elements before sorting" +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array of elements after sorting" +Arrays.toString(a));
		

	}
	
}
