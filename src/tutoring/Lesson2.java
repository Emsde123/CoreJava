package tutoring;



import java.util.*;

import tutoring.group3.Parent;

public class Lesson2 {

	public static void main(String[] args) {
		
		String s = Parent.getName();
		System.out.println(s);

		//					ARRAYS PRACTICE

//.		int [] arr2 = {1,0,     5,    8,9,      10,20,15,2,3};
//		----------------------------------------------------------------------------------------------------------------------------------------------------------		
														// REVERSE THE ARRAY

												// METHOD 1 
		// We start at the end of the array, counting backwards. We then print the element at [i]
//		for(int i = arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]);
//			if(i != 0) {
//				System.out.print(", ");
//			}
//			
//		}
		
								//				METHOD 2
		// below method creates a new array, and uses multiple counters in one line.
		// You don't need 2 loops to use two counters. One counter counts backwards on the first array
		// while the 2nd counter counts upwards on the second. It places the backwards element at [i] 
		// at the forward element at [j]
//		int [] newArr = new int [arr.length];
//		
//		for(int i = arr.length - 1, j = 0; i>=0; i--, j++) {
//			newArr[j] = arr[i];
//		}
//		System.out.println(Arrays.toString(newArr));
		
		
							//					METHOD 3
		
//		for(int i = 0; i < arr.length / 2; i++) {
//			int temp = arr[i];
//			arr[i] = arr[arr.length - 1 - i];
//			arr[arr.length - 1 - i] = temp;
//			
//		}System.out.println(Arrays.toString(arr));
		
		
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------		
		//												REVERSE HALF OF AN ARRAY
		//
		//				 9,8      5,    0,1
		// int [] arr = {1,0,     5,    8,9,      10,20,15,2,3};
		
		
		// We take the left index(0) of our array as a starting point.
		// We will stop looping through array when array index is equal to a quarter of the array length (half of the array half)
		// 
//		System.out.println("Array length is: " + arr.length + ". We will stop swapping when element reaches index: " + arr.length/4);
//		for(int leftIndex = 0; leftIndex < arr.length / 4; leftIndex++) {
//			
//			// Our right index will be equal to index of half of array minus 1 (because index is equal to length - 1)
//			// We also subtract the value of left index from there, since right index should be dynamic.
//			
//			int rightIndex = arr.length/2 - 1 - leftIndex;
//			
//			// we create temporary variable to store value from the element on the left
//			
//			int temp = arr[leftIndex];
//			System.out.println("Index on the left is: " + leftIndex + ". Current value of array at index " + leftIndex + " is: " + arr[leftIndex] );
//			
//			// we assign value from the right to the array element on the left. 
//			
//			System.out.println("current right index is " + arr[rightIndex]);
//			arr[leftIndex] = arr[rightIndex];
//			System.out.println("Value of left element after assignment is:  " + arr[leftIndex]);
//			
//			// We assign the old value which left had to the element on the right.
//			// Remember, value on the left was updated in the line above, that's why we need a temp variable. So that we can store it.
//			
//			arr[rightIndex] = temp;
//			System.out.println(Arrays.toString(arr));
//		}	
//----------------------------------------------------------------------------------------------------------------------------------------------------------		
//											REMOVE	DUPLICATES 
		
		// This way to check for duplicates is utilizing ArrayList, we use a forloop to iterate through the array.
		// We go inside with an if statement and we say if list (ArrayList) doesn't contain the value yet, it adds the value to the list.
		// This creates an ArrayList with all the duplicates removed.
//		int [] arr = {11,10,11,15,16,16,5,8,1,1,0,5,8};
//		ArrayList <Integer> list = new ArrayList<>();
//		
//		for(int i = 0; i<arr.length; i++) {
//			if(!list.contains(arr[i])) {
//				list.add(arr[i]);
//			}
//		}
//		System.out.println(list);
//----------------------------------------------------------------------------------------------------------------------------------------------------------		
											
		
		for(; ;) {
			System.out.println("stack");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
