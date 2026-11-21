package Array;

import java.util.Arrays;

public class Sorting_Elements_in_Array {

	public static void main(String[] args) {

		int a[]= {100,600,200,400,500};
		
		System.out.println("Before Sorting...");;
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);  //sort elements in array
		
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a));
		
		
	}

}
